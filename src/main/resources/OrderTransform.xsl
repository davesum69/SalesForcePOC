<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:edx="http://com.elasticpath/repo/order"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:ns2="http://com.elasticpath/repo/common"
    xmlns:fn="http://www.w3.org/2005/xpath-functions"
    exclude-result-prefixes="xs">
   
   <!-- We are setting the output method format to receive it as xml as sfdc requires xml according to this app logic -->
   	   <xsl:output method="xml" indent="yes"/>
    
    <!-- This xsl tranform code will look for matching <order> in the EP order.xmls and apply the template. In the order template all the line related items which we add in cart on web should be present.(Device, plan, line, service,accessories,promos) -->
    
    	<xsl:template match="/edx:Order" >
 		
 		<!-- Get the maximum value among the line numbers in order.xml and assign it to variable called end for code looping -->
        <xsl:param name="end" select="xs:integer(max(edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem/edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value))" tunnel="yes" />  
      
       
        <!-- SObjectTreeRequest - only needed for XML insert to support salesforce xml structure- removing while we are using json-->
        
        <SObjectTreeRequest>
        
        <!-- In salesforce each order.xml is considered as a Case. Just as an example to explain the salesforce logic Records are created and a dummy # is assigned to it to support the relationships between objects on salesforce to do mapping -->
        <records type="Case" referenceId="#REFID_PLACE_HOLDER#">
        
        <!-- This xsl tranform code will look for matching <header> in the EP order.xmls and apply the template -->
                
                <xsl:apply-templates select="edx:Header"/>
        
        <!-- If the code encouters <promotions> in the order.xml it will create a kind of array and apply template to store all the promos and map to sfdc. In sfdc it is rleationship to link with case. -->        
                 
              <!-- <xsl:if test="edx:Header/edx:Promotions/edx:Promotion or edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY'and edx:Mandatory='N']">
                   <xsl:element name="Promo_Codes__r">
			    		<xsl:apply-templates select="edx:Header/edx:Promotions/edx:Promotion"/>   
                   <xsl:apply-templates select="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY'and edx:Mandatory='N'] "/>
                  </xsl:element>
                  </xsl:if> -->
       
         <!-- This xsl tranform code will look for matching <child or parent tags> in the EP order.xmls and apply the template -->      
                <xsl:apply-templates select="edx:Customer"/>
                <xsl:apply-templates select="edx:Payments/edx:Payment"/>
                <xsl:apply-templates select="edx:Addresses/edx:Address[ns2:AddressType='BILLING']"/>
                <xsl:apply-templates select="edx:Addresses/edx:Address[ns2:AddressType='SHIPPING']"/>
                <xsl:apply-templates select="edx:Addresses/edx:Address[ns2:AddressType='E911']"/>
                <xsl:apply-templates select="edx:Shipments/edx:Shipment"/>
     
     <!-- The things related a line on cart like device, plan,service,line fall under line_items__r (shopping cart section on salesforce).Other things like accessories, promos which are at cart level should be outside lineitems__r -->
     
     	<xsl:if test="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='DEVICE' or edx:ItemType='PLAN' or edx:ItemType='LINE' or edx:ItemType='SERVICE' or (edx:ItemType='ACCESSORY' and edx:Mandatory='Y')]">           
    
		    <xsl:element name="Line_Items__r">
			  
			   <!-- start variable stores the initial value of line number as 1 to start the looping to check and support single/multi line order. -->
			        <xsl:variable name="start" select="1" /> 
			     
			   <!-- CurrentNode variable stores the current node position in the xsl traverse path --> 
			        <xsl:variable name="currentNode" select="." /> 
			    
			    <!-- Lopping to start from line number =1 to the max values of no of lines in order.xml -->
				    <xsl:for-each select="$start to $end">
				    
				<!-- variable to get the current position value -->    
				    <xsl:variable name="cou" select="position()"/>	
		
		<xsl:if test="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[(edx:ItemType='DEVICE' or edx:ItemCode='TRADEIN' or edx:ItemType='PLAN' or edx:ItemType='LINE' or edx:ItemType='SERVICE' or (edx:ItemType='ACCESSORY' and edx:Mandatory='Y')) and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]">                
		           
		         <!-- Just as an example to explain the salesforce logic Line_Item__c is like array item id in array of items. Line_item__r is used to create the array -->
		         
		           <records type="Line_Item__c" referenceId="#REFID_PLACE_HOLDER#">
			    
			    		<xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='DEVICE' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/>   
			    		<xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='PLAN' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/>   
			            <xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='LINE' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/>            
			            <xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[(edx:ItemType='ACCESSORY' and edx:Mandatory='Y') and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou ]"/>
			            <xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemCode='TRADEIN' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/> 
			    	    <xsl:if test="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='SERVICE' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]">
							<xsl:element name="Features__r">
							   <xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='SERVICE' and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/>
							</xsl:element>											
						</xsl:if>	  	
						
						<xsl:if test="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[(edx:ItemType='DEVICE' or edx:ItemType='LINE' or edx:ItemType='PLAN' or edx:ItemType='SERVICE' or (edx:ItemType='ACCESSORY' and edx:Mandatory='Y')) and edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou and edx:Promotions/edx:Promotion]">				
	                      <xsl:element name="Promos__r">
				            <xsl:apply-templates select="$currentNode/edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem/edx:Promotions[../edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value=$cou]"/>
	                      </xsl:element>
	                    </xsl:if>
							
				  	</records>
			 </xsl:if>
	</xsl:for-each> 
  </xsl:element>
</xsl:if>   
        
            <!-- We create xxx __r whenever we have to loop for multiple items by itself by matching the template of same kind like services, accessories, promos-->
               <xsl:if test="edx:Header/edx:Promotions/edx:Promotion or edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY' and edx:Mandatory='N'] or (edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY' and edx:Mandatory='N'] and edx:Promotions/edx:Promotion)">
                    <xsl:element name="Accessories__r">
                            <xsl:apply-templates select="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY'and edx:Mandatory='N']" />
                        <xsl:apply-templates select= "edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem/edx:Promotions/edx:Promotion/edx:type[../../../(edx:ItemType='ACCESSORY' and edx:Mandatory='N')]"/>
                            <xsl:apply-templates select="edx:Header/edx:Promotions/edx:Promotion "/>   
                    </xsl:element>
                </xsl:if>    
   </records>
	<!-- SObjectTreeRequest - only needed for XML insert - removing while we are using json    -->            
	</SObjectTreeRequest>        
</xsl:template>


<!-- Start of matching templates stated in above <order> template -->
<!-- Generic note element name represents the api_label on salesforce and edx:something refers to the tag label in the order.xml -->

  <xsl:template match="edx:Header/edx:Promotions/edx:Promotion">

	<records type="Accessory__c" referenceId="#REFID_PLACE_HOLDER#">
                            
      <!-- Item Name -->
            <xsl:element name="Name">
                    <xsl:value-of select="concat('PROMO',' ',position())" />
            </xsl:element>
      
      <!-- Promo Name -->   
         <xsl:if test="edx:displayName!= ''">
            <xsl:element name="Promotional_Offer_Details__c">
                <xsl:value-of select="edx:displayName" />
            </xsl:element>
        </xsl:if>   
        
       <!-- Discount Amount/Value -->   
         <xsl:if test="edx:discountTotalAmount!= ''">
            <xsl:element name="Promo_Code_Value__c">
                <xsl:value-of select="fn:replace(edx:discountTotalAmount,' USD', '')" />
            </xsl:element>
        </xsl:if> 
        
        <!-- Promo/Coupon Code -->
        <xsl:if test="edx:coupons/edx:CouponCode/edx:code != ''">
            <xsl:element name="Promo_Code__c">
                <xsl:value-of select="edx:coupons/edx:CouponCode/edx:code" />
            </xsl:element>
        </xsl:if>
        
        
        <!-- Promo/Coupon Expiry Date -->
        <!-- <xsl:if test="edx:coupons/edx:CouponCode/edx:code != ''">
            <xsl:element name="  Promo_Code_Expiration_Date__c">
                <xsl:value-of select="edx:coupons/edx:CouponCode/edx:code" />
            </xsl:element>
        </xsl:if>-->
      

	</records>

</xsl:template>


<xsl:template match=" edx:Promotions/edx:Promotion/edx:type">

	<records type="Accessory__c" referenceId="#REFID_PLACE_HOLDER#">
                            
      <!-- Item Name -->
            <xsl:element name="Name">
                    <xsl:value-of select="concat('PROMO','-',../../../edx:ItemType)" />
            </xsl:element>
      
      <!-- Promo Name -->   
         <xsl:if test="../edx:displayName!= ''">
            <xsl:element name="Promotional_Offer_Details__c">
                <xsl:value-of select="../edx:displayName" />
            </xsl:element>
        </xsl:if>   
        
       <!-- Discount Amount/Value -->   
         <xsl:if test="../edx:discountTotalAmount!= ''">
            <xsl:element name="Promo_Code_Value__c">
                <xsl:value-of select="fn:replace(../edx:discountTotalAmount,' USD', '')" />
            </xsl:element>
        </xsl:if> 
        
        <!-- Promo/Coupon Code -->
        <xsl:if test="../edx:coupons/edx:CouponCode/edx:code != ''">
            <xsl:element name="Promo_Code__c">
                <xsl:value-of select="../edx:coupons/edx:CouponCode/edx:code" />
            </xsl:element>
        </xsl:if>
        
        
        <!-- Promo/Coupon Expiry Date -->
        <!-- <xsl:if test="../edx:coupons/edx:CouponCode/edx:code != ''">
            <xsl:element name="  Promo_Code_Expiration_Date__c">
                <xsl:value-of select="../edx:coupons/edx:CouponCode/edx:code" />
            </xsl:element>
        </xsl:if>-->
      

	</records>

</xsl:template>

    <xsl:template match="edx:Header">
        
        <!-- Web Order Number -->
        <xsl:if test="edx:OrderNumber != ''">
            <xsl:element name="Web_Order_ID__c">
                <xsl:value-of select="edx:OrderNumber" />
            </xsl:element>
        </xsl:if>
        
        <!-- Date and Time Entered -->
        <xsl:if test="edx:CreatedDate != ''">
            <xsl:element name="Web_Order_Submission_Time__c">
                <xsl:value-of select="edx:CreatedDate" />
            </xsl:element>
        </xsl:if>
        
        <!-- Language preference  
        <xsl:if test="edx:Locale != ''">
            <xsl:element name="Language_preference__c">
                <xsl:value-of select="edx:Locale" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Total Taxes -->
            <xsl:if test="edx:TotalTaxes != ''">
               <xsl:element name="Total_amount_of_Taxes_assessed__c">
                 <xsl:value-of select="fn:replace(edx:TotalTaxes,' USD', '')" />
                </xsl:element>
             </xsl:if>
        
        <!-- Total Shipping Cost  -->
        <xsl:if test="edx:TotalShippingCostBeforeTax != ''">
            <xsl:element name="Shipping_Method_price__c">
                <!-- <xsl:value-of select="edx:TotalShippingCostBeforeTax" />-->
                <xsl:value-of select="fn:replace(edx:TotalShippingCostBeforeTax,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        
        <!-- Total Loan Amount (NFS) -->
         <xsl:if test="edx:TotalLoanAmount != ''">
            <xsl:element name="Total_Financed_Amount__c">
                <!-- <xsl:value-of select="edx:TotalLoanAmount" />-->
                <xsl:value-of select="fn:replace(edx:TotalLoanAmount,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        
        <!-- All Lines Today -->
        <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal']/ns2:Value != ''">
            <xsl:element name="All_Lines_Today__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        <!-- All Lines Today -->
        <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal']/ns2:Value != ''">
            <xsl:element name="All_Lines_Monthly__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        <!-- Accessories subtotal Today -->
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='AccessoriesPayNowSubTotal']/ns2:Value != ''">
            <xsl:element name="All_Accessories_Today__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='AccessoriesPayNowSubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        <!-- Accessories subtotal Monthly -->
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='AccessoriesMonthlySubTotal']/ns2:Value != ''">
            <xsl:element name="All_Accessories_Monthly__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='AccessoriesMonthlySubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        <!-- Cart Subtotal Today -->
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='CartPayNowSubTotal']/ns2:Value != ''">
            <xsl:element name="Subtotal_Today__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='CartPayNowSubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        <!-- Cart Subtotal Monthly -->
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='CartMonthlySubTotal']/ns2:Value != ''">
            <xsl:element name="Subtotal_Monthly__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='CartMonthlySubTotal']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
        
        
        
        <!-- Selected Credit Class(Excellent, Building, No Credit) - not accepted by SF-->
	      <!-- <xsl:choose>
	        <xsl:when test="edx:Fields/edx:Field[ns2:Key='CreditLevel']/ns2:Value != ''">
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='CreditLevel']/ns2:Value = 'GOOD'">
		            <xsl:element name="Selected_Credit_Class__c">Awesome Credit</xsl:element>
		        </xsl:if>
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='CreditLevel']/ns2:Value = 'BUILDING'">
		            <xsl:element name="Selected_Credit_Class__c">Average Credit</xsl:element>
		        </xsl:if>
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='CreditLevel']/ns2:Value = 'NONE'">
		            <xsl:element name="Selected_Credit_Class__c">No Credit</xsl:element>
		        </xsl:if>
	        </xsl:when>
	      </xsl:choose> -->
	        
        <!-- Social Security Number  -->
	        <!-- <xsl:if test="edx:Fields/edx:Field[ns2:Key='customer.ssn'] != ''">
	            only getting last for from EP
	            <xsl:if test="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 1, 3) != ''">
	                <xsl:element name="SSN_1__c">
	                    <xsl:value-of select="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 1, 3)" />                
	                </xsl:element>
	            </xsl:if>
	            <xsl:if test="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 4, 2) != ''">
	                <xsl:element name="SSN_2__c">
	                    <xsl:value-of select="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 4, 2)" />                
	                </xsl:element>
	             </xsl:if>
	            <xsl:if test="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 6, 4) != ''">
	                <xsl:element name="SSN_3__c">
	                    <xsl:value-of select="substring(edx:Fields/edx:Field[ns2:Key='customer.ssn']/ns2:Value, 6, 4)" />                
	                </xsl:element>
	            </xsl:if>
	        </xsl:if> -->
                            
        <!-- Total Monthly Price-->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'MonthlyPrice' to SF 'Total_monthly__c' - need to check mapping</xsl:comment>
                <xsl:element name="Total_monthly__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value, ' USD', '')"/>
                </xsl:element>
            </xsl:if>
            
        <!-- Total PayNowPrice Price-->                 
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'PayNowPrice' to SF 'Total_today__c' - need to check mapping</xsl:comment>
                <xsl:element name="Total_today__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value, ' USD', '')"/>
                </xsl:element>
            </xsl:if>
            
        <!-- Total Monthly Cost-->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'MonthlyPrice' to SF 'Total_monthly__c' - need to check mapping</xsl:comment>
                <xsl:element name="Total_Monthly_Costs__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value, ' USD', '')"/>
                </xsl:element>
            </xsl:if>
            
        <!-- Total RefundableDepositAmount Price    -->         
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='RefundableDepositAmount']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'RefundableDepositAmount' to SF 'Total_deposits__c' - need to check mapping</xsl:comment>
                <xsl:element name="Total_deposits__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='RefundableDepositAmount']/ns2:Value, ' USD', '')"/>    
                </xsl:element>
            </xsl:if>    
            
        <!-- One Time Service Fee -->
            <xsl:comment>Mapping EP 'One time fees' to SF 'One_Time_Fees__c' - need to check mapping once EP Sends data</xsl:comment>
            <xsl:element name="One_Time_Fees__c">0.00</xsl:element>
           
        <!-- Language Preference selection   -->         
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='KEY_LANGUAGE_PREFERENCE']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'KEY_LANGUAGE_PREFERENCE' to SF 'Language_preference__c' - need to check mapping</xsl:comment>
                <xsl:element name="Language_preference__c">       
                 <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='KEY_LANGUAGE_PREFERENCE']/ns2:Value" />
                </xsl:element>    
            </xsl:if>   
       
       <!-- Auto Pay selection   --> 
       		<xsl:if test="edx:Fields/edx:Field[ns2:Key='AUTO_PAY']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'AUTO_PAY' to SF 'Auto_Pay__c' - need to check mapping</xsl:comment>
                <xsl:element name="Auto_Pay__c">       
                 <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='AUTO_PAY']/ns2:Value" />
                </xsl:element>    
            </xsl:if>
            
       <!-- Store Pay selection   --> 
       		<xsl:if test="edx:Fields/edx:Field[ns2:Key='STORE_PAYMENT']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'STORE_PAYMENT' to SF 'Store_Pay__c' </xsl:comment>
                <xsl:element name="Store_Pay__c">       
                 <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='STORE_PAYMENT']/ns2:Value" />
                </xsl:element>    
            </xsl:if>     
            
        <!-- Lines Due Today Subtotal 1 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.1']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday1__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.1']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 1 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.1']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly1__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.1']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 2 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.2']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday2__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.2']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 2 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.2']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly2__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.2']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if> -->
        
        <!-- Lines Due Today Subtotal 3 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.3']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday3__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.3']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if> -->
        
        <!-- Lines Monthly Subtotal 3 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.3']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly3__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.3']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 4 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.4']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday4__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.4']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 4 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.4']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly4__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.4']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 5 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.5']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday5__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.5']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 5 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.5']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly5__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.5']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 6 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.6']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday6__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.6']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 6 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.6']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly6__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.6']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 7 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.7']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday7__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.7']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 7 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.7']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly7__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.7']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Due Today Subtotal 8 
           <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.8']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueToday8__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesPayNowSubTotal.8']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- Lines Monthly Subtotal 8 
         <xsl:if test="edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.8']/ns2:Value != ''">
            <xsl:element name="LinesTotalDueMonthly8__c">
                <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='LinesMonthlySubTotal.8']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>-->
               
    </xsl:template>

    <xsl:template match="edx:Customer">
        
        <!-- Customer First Name -->
        <xsl:if test="ns2:FirstName != ''">
            <xsl:element name="Contact_First_Name__c">
                <xsl:value-of select="ns2:FirstName" />
            </xsl:element>
        </xsl:if>
        
        <!-- Customer Last Name -->
        <xsl:if test="ns2:LastName != ''">
            <xsl:element name="Contact_Last_Name__c">
                <xsl:value-of select="ns2:LastName" />
            </xsl:element>
        </xsl:if>
        
        <!-- Customer Middle initial - only get the first character -->
        <xsl:if test="ns2:MiddleName != ''">
            <xsl:element name="Contact_Middle_Initial__c">
                <xsl:value-of select="substring(ns2:MiddleName, 1, 1)" />
            </xsl:element>
        </xsl:if>
        
        <!-- DOB -->
        <xsl:if test="ns2:DOBYear !=' ' and ns2:DOBYear !=' ' and ns2:DOBYear !=' '">
            <xsl:element name="Date_Of_Birth__c">
                <xsl:value-of select="format-number(ns2:DOBYear,'0000')" />-<xsl:value-of select="format-number(ns2:DOBMonth,'00')" />-<xsl:value-of select="format-number(ns2:DOBDay,'00')" />
        </xsl:element>
        </xsl:if>
        
        <!-- Phone Number  -->
        <xsl:if test="ns2:Tel != ''">
            <!--  <xsl:element name="Home_Phone_1__c">
                <xsl:value-of select="substring(ns2:Tel,1,3)" />
            </xsl:element>
            <xsl:element name="Home_Phone_2__c">
                <xsl:value-of select="substring(ns2:Tel,4,3)" />
            </xsl:element>
            <xsl:element name="Home_Phone_3__c">
                <xsl:value-of select="substring(ns2:Tel,7,4)" />
            </xsl:element>-->
            <xsl:element name="Home_Phone__c">
                <xsl:value-of select="concat('(',substring(ns2:Tel,1,3),')','',substring(ns2:Tel,4,3),'-',substring(ns2:Tel,7,4))" />
            </xsl:element>
        </xsl:if>
                    
                    
        <!-- E-Mail  -->
        <xsl:if test="ns2:Email != ''">
            <xsl:element name="E_Mail__c">
                <xsl:value-of select="ns2:Email" />
            </xsl:element>
        </xsl:if>
        
        <!-- PreviousCarrier  -->
        <xsl:choose>
	        <xsl:when test="ns2:PreviousCarrier != ''">
			     <xsl:if test="ns2:PreviousCarrier !='NULL'"> 
			         <xsl:element name="Carrier__c">
			            <xsl:value-of select="ns2:PreviousCarrier" />
			         </xsl:element>
			     </xsl:if>
	         </xsl:when>
        </xsl:choose>
       <!-- ID State -->
        <xsl:if test="ns2:CreditCheckIDState != ''">
            <xsl:element name="ID_State__c">
                <xsl:value-of select="ns2:CreditCheckIDState" />
            </xsl:element>
        </xsl:if>
    
        <!-- ID Type  -->
        <xsl:if test="ns2:CreditCheckIDType != ''">
            <xsl:element name="ID_Type__c">
                <xsl:value-of select="ns2:CreditCheckIDType" />
            </xsl:element>
        </xsl:if>
        
        <!-- ID Number -->
        <xsl:if test="ns2:CreditCheckIDNumber != ''">
            <xsl:element name="ID_Number__c">
                <xsl:value-of select="ns2:CreditCheckIDNumber" />
            </xsl:element>
        </xsl:if>
        
        <!-- ID ExpDate -->
        <xsl:if test="ns2:CreditCheckIDExpDateMonth !=' ' and ns2:CreditCheckIDExpDateYear !=' '">
            <xsl:element name="ID_Exp_Date__c">
                <xsl:value-of select="format-number(ns2:CreditCheckIDExpDateMonth,'00')" />-<xsl:value-of select="format-number(ns2:CreditCheckIDExpDateYear,'0000')" />
        </xsl:element>
        </xsl:if>
        <!-- Selected Credit Class(Excellent, Building, No Credit) - not accepted by SF-->
	    <xsl:choose>
	        <xsl:when test="ns2:CreditLevel != ''">
		        <xsl:if test="ns2:CreditLevel = 'GOOD' or ns2:CreditLevel = 'Good' ">
		            <xsl:element name="Selected_Credit_Class__c">Awesome Credit</xsl:element>
		        </xsl:if>
		        <xsl:if test="ns2:CreditLevel = 'BUILDING' or ns2:CreditLevel = 'Building'">
		            <xsl:element name="Selected_Credit_Class__c">Average Credit</xsl:element>
		        </xsl:if>
		        <xsl:if test="ns2:CreditLevel = 'NONE' or ns2:CreditLevel = 'None'">
		            <xsl:element name="Selected_Credit_Class__c">No Credit</xsl:element>
		        </xsl:if>
	        </xsl:when>
	      </xsl:choose>
	      
	       <!-- Social Security Number  -->
	        <xsl:if test="ns2:SSN != ''">
	            <!-- only getting last for from EP-->
	            <xsl:if test="substring(ns2:SSN, 1, 3) != ''">
	                <xsl:element name="SSN_1__c">
	                    <xsl:value-of select="substring(ns2:SSN, 1, 3)" />                
	                </xsl:element>
	            </xsl:if>
	            <xsl:if test="substring(ns2:SSN, 4, 2) != ''">
	                <xsl:element name="SSN_2__c">
	                    <xsl:value-of select="substring(ns2:SSN, 4, 2)" />                
	                </xsl:element>
	             </xsl:if>
	            <xsl:if test="substring(ns2:SSN, 6, 4) != ''">
	                <xsl:element name="SSN_3__c">
	                    <xsl:value-of select="substring(ns2:SSN, 6, 4)" />                
	                </xsl:element>
	            </xsl:if>
	        </xsl:if>
        
         <!-- PIN/Passcode  -->
        
	        <xsl:if test="ns2:PIN != '' or ns2:Pin != ''">
		        <xsl:if test="ns2:Pin != ''">
                   <xsl:element name="PIN_Passcode__c">
                      <xsl:value-of select="ns2:Pin" />
                   </xsl:element>
                </xsl:if>
            	<xsl:if test="ns2:PIN != ''">
                  <xsl:element name="PIN_Passcode__c">
                    <xsl:value-of select="ns2:PIN" />
                  </xsl:element>
                </xsl:if>
	        </xsl:if>
	      
      <!--   <xsl:if test="ns2:Pin != '' or n">
            <xsl:element name="PIN_Passcode__c">
                <xsl:value-of select="ns2:Pin" />
            </xsl:element>
        </xsl:if> -->
     
        
    </xsl:template>

    <xsl:template match="edx:Addresses/edx:Address[ns2:AddressType='BILLING']">
        
        <!-- Billing Address Line 1 -->
        <xsl:if test="ns2:Street1 != ''">
            <xsl:element name="Billing_Address_Line_1__c">
                <xsl:value-of select="ns2:Street1" />
            </xsl:element>
        </xsl:if>
        
        <!-- Billing Address Line 2 -->
        <xsl:if test="ns2:Street2 != ''">
            <xsl:element name="Billing_Address_Line_2__c">
                <xsl:value-of select="ns2:Street2" />
            </xsl:element>
        </xsl:if>
        
        <!-- Billing Address City -->
        <xsl:if test="ns2:City != ''">
            <xsl:element name="Billing_Address_City__c">
                <xsl:value-of select="ns2:City" />
            </xsl:element>
        </xsl:if>
        
        <!-- Billing Address State  -->
        <xsl:if test="ns2:Region != ''">
            <xsl:element name="Billing_Address_State__c">
                <xsl:value-of select="ns2:Region" />
            </xsl:element>
        </xsl:if>
        
        <!-- Country -->
        <xsl:if test="ns2:Country != ''">
            <xsl:element name="Billing_Address_Country__c">
                <xsl:value-of select="ns2:Country" />
            </xsl:element>
        </xsl:if>
        
        <!-- Billing Address Zip  -->
        <xsl:if test="ns2:ZipPostalCode != ''">
            <xsl:element name="Billing_Address_Zip__c">
                <xsl:value-of select="ns2:ZipPostalCode" />
            </xsl:element>
        </xsl:if>
        
    </xsl:template>   
    
     <xsl:template match="edx:Addresses/edx:Address[ns2:AddressType='E911']">
        
        <!-- E911 Address Line 1 -->
        <xsl:if test="ns2:Street1 != ''">
            <xsl:element name="E911_Address_Line_1__c">
                <xsl:value-of select="ns2:Street1" />
            </xsl:element>
        </xsl:if>
        
        <!-- E911 Address Line 2 -->
        <xsl:if test="ns2:Street2 != ''">
            <xsl:element name="E911_Address_Line_2__c">
                <xsl:value-of select="ns2:Street2" />
            </xsl:element>
        </xsl:if>
        
        <!-- E911 Address City -->
        <xsl:if test="ns2:City != ''">
            <xsl:element name="E911_Address_City__c">
                <xsl:value-of select="ns2:City" />
            </xsl:element>
        </xsl:if>
        
        <!-- E911 Address State  -->
        <xsl:if test="ns2:Region != ''">
            <xsl:element name="E911_Address_State__c">
                <xsl:value-of select="ns2:Region" />
            </xsl:element>
        </xsl:if>
                
        <!-- E911 Address Zip  -->
        <xsl:if test="ns2:ZipPostalCode != ''">
            <xsl:element name="E911_Address_Zip__c">
                <xsl:value-of select="ns2:ZipPostalCode" />
            </xsl:element>
        </xsl:if>
        
    </xsl:template>     
    <xsl:template match="edx:Shipments/edx:Shipment">
        
        <!-- Number of Lines - Pulling this from the LINE ItemType  
        <xsl:if test="edx:LineItems/edx:LineItem[edx:ItemType='LINE']/edx:Quantity != ''">
            <xsl:element name="Number_of_Line_Items_rollup__c">
                <xsl:value-of select="fn:sum(edx:LineItems/edx:LineItem[edx:ItemType='LINE']/edx:Quantity)" />
            </xsl:element>
        </xsl:if>-->
    
        <!-- Shipping option (stand, overnight, or Saturday)  -->
            <!-- ShippingOption  -->
            <xsl:if test="edx:ServiceLevel != ''">
                <xsl:element name="Shipping_Method_selected__c">
                    <xsl:value-of select="edx:ServiceLevel" />
                </xsl:element>
            </xsl:if>
            
            <!-- Estimated Time -->
            <xsl:if test="edx:ShipmentOptionDescription!= ''">
                <xsl:element name="Estimated_Delivery__c">
                    <xsl:value-of select="edx:ShipmentOptionDescription" />
                </xsl:element>
            </xsl:if>
                

    </xsl:template>        

    <xsl:template match="edx:Addresses/edx:Address[ns2:AddressType='SHIPPING']">
        
        <!-- Shipping Address Line 1  -->
        <xsl:if test="ns2:Street1 != ''">
            <xsl:element name="Address_Line_1__c">
                <xsl:value-of select="ns2:Street1" />
            </xsl:element>
        </xsl:if>
        
        <!-- Shipping Address Line 2  -->
        <xsl:if test="ns2:Street2 != ''">
            <xsl:element name="Address_Line_2__c">
                <xsl:value-of select="ns2:Street2" />
            </xsl:element>
        </xsl:if>
        
        <!-- Shipping Address City  -->
        <xsl:if test="ns2:City != ''">
            <xsl:element name="Address_City__c">
                <xsl:value-of select="ns2:City" />
            </xsl:element>
        </xsl:if>
        
        <!-- Shipping Address State  -->
        
        <xsl:if test="ns2:Region != ''">
            <xsl:element name="Address_State__c">
                <xsl:value-of select="ns2:Region" />
            </xsl:element>
        </xsl:if>
        
        <!-- Country -->
        <xsl:if test="ns2:Country != ''">
            <xsl:element name="Shipping_Address_Country__c">
                <xsl:value-of select="ns2:Country" />
            </xsl:element>
        </xsl:if>
        
        <!-- Shipping Address Zip  -->
        <xsl:if test="ns2:ZipPostalCode != ''">
            <xsl:element name="Address_Zip__c">
                <xsl:value-of select="ns2:ZipPostalCode" />
            </xsl:element>
        </xsl:if>
    </xsl:template>        
    
    <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='ACCESSORY' and edx:Mandatory='N']">
         <records type="Accessory__c" referenceId="#REFID_PLACE_HOLDER#">
         
          <!-- Accessory Name -->
             <xsl:element name="Name">
                    <xsl:value-of select="concat('ACCESSORY',' ',position())" />
            </xsl:element>
             
             <!-- Accessory Display Name -->
             <xsl:if test="edx:DisplayName != ''">
                    <xsl:element name="Accessory_Name__c">
                        <xsl:value-of select="edx:DisplayName" />
                    </xsl:element>
                </xsl:if>
                
            <!-- Accessory SKU -->
            <xsl:if test="edx:ItemCode !=''">
                <xsl:element name="Accessory_SKU__c">
                        <xsl:value-of select="edx:ItemCode" />
                </xsl:element>
            </xsl:if>
            
            <!-- Accessory Price -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value != ''">
                <xsl:element name="Accessory_Price__c">
                        <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Accessory Quantity -->
            <xsl:if test="edx:Quantity !=''">
                <xsl:element name="Quantity__c">
                        <xsl:value-of select="edx:Quantity" />
                </xsl:element>
            </xsl:if>
            
            <!-- Accessory Availability -->
            <xsl:if test="edx:InventoryStatus !=''">
                <xsl:element name="Accessory_Availability__c">
                        <xsl:value-of select="edx:InventoryStatus" />
                </xsl:element>
            </xsl:if>
            
            <!-- Accessory Per Item Price -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value != ''">
                <xsl:element name="Cost__c">
                        <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Accessory due today Price -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
                <xsl:element name="Total_Accessory_Due_Today__c">
                        <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>    
            
             <!-- Accessory due monthly Price -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:element name="Total_Accessory_Due_Monthly__c">
                        <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>  
            
              <!-- Accessory Payment Option -->
                        
            <xsl:choose>            
            <xsl:when test="edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value != '' and edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value= 'FULL' ">
                <xsl:comment>Mapping EP 'AccessoryPaymentOption' to SF 'AccessoryPaymentOption' </xsl:comment>
                <xsl:element name="Payment_Option__c">Full Retail Price</xsl:element>
            </xsl:when>
            
            <xsl:when test="edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value != '' and edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value= 'EIP' and edx:Fields/edx:Field[ns2:Key='ContractTerm']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'AccessoryPaymentOption' to SF 'AccessoryPaymentOption' </xsl:comment>
                 <xsl:element name="Payment_Option__c">
                        <xsl:value-of select="concat(edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value,' ','-',' ',edx:Fields/edx:Field[ns2:Key='ContractTerm']/ns2:Value)" />
                </xsl:element>
            </xsl:when>
         </xsl:choose>
         
         
         
           </records>
           
    </xsl:template>
    
    
    <xsl:template match="edx:Promotions">
          <xsl:for-each select="edx:Promotion">
                        
                           <records type="Promo__c" referenceId="#REFID_PLACE_HOLDER#">
                                                                      
                                        <xsl:element name="Name">
                                          <xsl:value-of select="concat('PROMO','-',../../edx:ItemType)" />
                                        </xsl:element>

                                        <xsl:if test="edx:type !=''" >
                                        <xsl:element name="Promo_Type__c">
                                            <xsl:value-of select="edx:type"/>
                                        </xsl:element>
                                        </xsl:if>
                                        
								         <xsl:if test="edx:displayName!= ''">
								            <xsl:element name="Promotional_Offer_Details__c">
								                <xsl:value-of select="edx:displayName" />
								            </xsl:element>
								        </xsl:if>   
								        
								         
								         <xsl:if test="edx:discountTotalAmount!= ''">
								            <xsl:element name="Discount_Amount__c">
								                <xsl:value-of select="fn:replace(edx:discountTotalAmount,' USD', '')" />
								            </xsl:element>
								        </xsl:if> 
								        
								        
								        <xsl:if test="edx:coupons/edx:CouponCode/edx:code != ''">
								            <xsl:element name="Promo_Code__c">
								                <xsl:value-of select="edx:coupons/edx:CouponCode/edx:code" />
								            </xsl:element>
								        </xsl:if>                                        
                            </records>
             </xsl:for-each>         
     </xsl:template>
    
    
      <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='DEVICE']">
            
            <xsl:comment>Mapping EP 'DEVICE' to SF 'Line Item'</xsl:comment>
                                
            <!-- Item Name -->
         
          <xsl:choose>            
            <xsl:when test="edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value != '' and edx:LineType != ''">
              <xsl:comment>Mapping EP 'linetype' to SF 'name field for device' </xsl:comment>
                
	                <xsl:if test="edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value != '' and (edx:LineType = 'Voice' or edx:LineType = 'VOICE')">
	                <xsl:element name="Name">
	                <xsl:value-of select="concat('LINE',' ',edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value,' ','-',' ','VOICE')" />
	                </xsl:element>
	                </xsl:if>
               
                <xsl:comment>Mapping EP 'linetype' to SF 'name field for device' </xsl:comment>
             
	                <xsl:if test="edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value != '' and (edx:LineType = 'MI' or edx:LineType = 'mi')">
	                 <xsl:element name="Name">
	                <xsl:value-of select="concat('LINE',' ',edx:Fields/edx:Field[ns2:Key='LineNumber']/ns2:Value,' ','-',' ',edx:LineType)" />
	                 </xsl:element>
	                </xsl:if>
                
            </xsl:when>
         </xsl:choose>

                                                
            <!-- Device Model  -->                
            <xsl:if test="edx:DisplayName != ''">
                <xsl:element name="Device_Model__c">
                    <xsl:value-of select="edx:DisplayName" />
                </xsl:element>
            </xsl:if>
            
            <!-- SKU  -->
            <xsl:if test="edx:ItemCode != ''">
                <xsl:element name="Device_SKU__c">
                    <xsl:value-of select="edx:ItemCode" />
                </xsl:element>
            </xsl:if>
            
            <!-- Device Availability -->
            <xsl:if test="edx:InventoryStatus !=''">
                <xsl:element name="Device_Availability__c">
                        <xsl:value-of select="edx:InventoryStatus" />
                </xsl:element>
            </xsl:if>
            
            <!-- DeviceColor  -->
            <xsl:if test="edx:Options/edx:Option[ns2:Key='COLOR']/ns2:Value != ''">
                <xsl:element name="Device_Color__c">
                    <xsl:value-of select="edx:Options/edx:Option[ns2:Key='COLOR']/ns2:Value" />
                </xsl:element>
            </xsl:if>
            
            <!-- DeviceMemorySize  -->
            <xsl:if test="edx:Options/edx:Option[ns2:Key='SIZE']/ns2:Value != ''">
                <xsl:element name="Device_Memory_size__c">
                    <xsl:value-of select="edx:Options/edx:Option[ns2:Key='SIZE']/ns2:Value" />
                </xsl:element>
            </xsl:if>
            
            <!-- Device Due Monthly Price -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'MonthlyPrice' to SF 'Device_Due_Monthly__c' - need to check mapping</xsl:comment>
                <xsl:element name="Device_Due_monthly__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Device Due Today Price -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'PayNowPrice' to SF 'Device_Due_Today__c' - need to check mapping</xsl:comment>
                <xsl:element name="Device_Due_Today__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Device Price -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'DevicePrice' to SF 'Device_Price__C' - need to check mapping</xsl:comment>
                <xsl:element name="Device_Price__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='FinalPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Device Discounts-->                
            
                <xsl:comment>Mapping EP 'DeviceDiscounts' to SF 'Device_Discounts__c' - need to check mapping when we get data from EP</xsl:comment>
                <xsl:element name="Device_Discounts__c">0.00</xsl:element>
                
            <!-- OneTimeBillCredit/standard trade-in offer value  -->
          <!--   <xsl:if test="edx:Fields/edx:Field[ns2:Key='OneTimeBillCredit']/ns2:Value != ''">
                <xsl:element name="Standard_Trade_in_Offer_Value__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='OneTimeBillCredit']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>  -->
            
            <!-- MonthlyBillCredit/Promotional Monthly trade-in offer value  -->
             <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value != ''">
                <xsl:element name="Promotional_Monthly_Trade_in_Offer_Value__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>  
            
           
        <!--    <xsl:choose>
	        <xsl:when test="edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value != ''">
		        <xsl:if test="(edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value = '0.00' or edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value = '0.00 USD') and edx:Fields/edx:Field[ns2:Key='OneTimeBillCredit']/ns2:Value != ''">
		            <xsl:element name="Standard_Trade_in_Offer_Value__c">
		              <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='OneTimeBillCredit']/ns2:Value,' USD', '')" />
		            </xsl:element>
		        </xsl:if>
		        <xsl:if test="(edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value = '0.00' or edx:Fields/edx:Field[ns2:Key='MonthlyBillCredit']/ns2:Value = '0.00 USD') and edx:Fields/edx:Field[ns2:Key='OneTimeBillCredit']/ns2:Value != ''">
		            <xsl:element name="Type_of_line__c">Mobile Internet</xsl:element>
		        </xsl:if>
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='subtype']/ns2:Value = 'WEARABLE'">
		            <xsl:element name="Type_of_line__c">Mobile Internet</xsl:element>
		        </xsl:if>
	        </xsl:when>
	      </xsl:choose> --> 
            
            <!-- Line Deposits-->                
            
             <!--    <xsl:comment>Mapping EP 'Line_Deposits' to SF 'total_Line_deposits__c' - need to check mapping when we get data from EP</xsl:comment>
                <xsl:element name="Total_Line_deposits__c">0.00</xsl:element> -->
                
       <!-- Payment_option -->    
         <xsl:choose>            
            <xsl:when test="edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value != '' and edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value= 'FULL' ">
                <xsl:comment>Mapping EP 'DevicePrice' to SF 'Device_Price__C' - need to check mapping</xsl:comment>
                <xsl:element name="Financing_Options_selected__c">Full Retail Price</xsl:element>
            </xsl:when>
            
            <xsl:when test="(edx:DisplayName != '' and edx:DisplayName = 'T-Mobile Data 3-in-1 SIM Kit') or (edx:ItemCode !='' and edx:ItemCode='610214641922')">
                <xsl:comment>Mapping EP 'DevicePrice' to SF 'Device_Price__C' - need to check mapping</xsl:comment>
                <xsl:element name="Financing_Options_selected__c"> </xsl:element>
            </xsl:when>
            
            <xsl:when test="edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value != '' and edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value= 'EIP' and edx:Fields/edx:Field[ns2:Key='ContractTerm']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'Device PaymentOption' to SF 'Device PaymentOption' </xsl:comment>
                 <xsl:element name="Financing_Options_selected__c">
                        <xsl:value-of select="concat(edx:Fields/edx:Field[ns2:Key='PAYMENT_OPTION']/ns2:Value,' ','-',' ',edx:Fields/edx:Field[ns2:Key='ContractTerm']/ns2:Value)" />
                </xsl:element>
            </xsl:when>
                
           <!--  <xsl:otherwise>   
                <xsl:comment>Mapping EP 'FRP or EIP' to SF 'Financing option' </xsl:comment>
                    <xsl:element name="Financing_Options_selected__c">EIP</xsl:element>
            
            </xsl:otherwise> -->
         </xsl:choose>
    </xsl:template>
            
    <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='PLAN']">
                
        <xsl:comment>Mapping EP 'PLAN' to SF 'Line Item'</xsl:comment>
            
            <!-- TODO: Map when we get data ADD If Plan Type -->

          <!--   <xsl:element name="Plan_Type__c">Individual</xsl:element> -->
                
        <!-- Monthly Cost  -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:element name="Rate_Plan_Plan_Price__c">
                 <!-- <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value" />-->
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
    
        <!-- Rate Plan Name  -->
            <xsl:if test="edx:DisplayName != ''">
                <xsl:element name="Rate_Plan_Selected__c">
                    <xsl:value-of select="edx:DisplayName" />
                </xsl:element>
            </xsl:if>
            
        <!-- Rate Plan SOC  -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='RatePlanSOC']/ns2:Value != ''">
                <xsl:element name="Plan_SOC__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='RatePlanSOC']/ns2:Value " />
                </xsl:element>
            </xsl:if>
            
        <!-- Rate Plan Type -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='UserType']/ns2:Value != ''">
                <xsl:element name="PlanType__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='UserType']/ns2:Value " />
                </xsl:element>
            </xsl:if>   
        
          <!--Plan Due Monthly Price -->                
                <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                    <xsl:comment>Mapping EP 'MonthlyPrice' to SF 'Plan_Due_Monthly__c' - need to check mapping</xsl:comment>
                    <xsl:element name="Plan_Due_Monthly__c">
                        <!-- <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value" />-->
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,' USD', '')" />
                    </xsl:element>
                </xsl:if>
        
          <!-- Plan Due Today Price -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'DueTodayPrice' to SF 'Plan_Due_Today__c' - need to check mapping</xsl:comment>
                <xsl:element name="Plan_Due_Today__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value,'USD','')" />
                </xsl:element>
            </xsl:if>

    </xsl:template>    
    
     <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemCode='TRADEIN']">
                
        <xsl:comment>Mapping EP 'DCP MANAGED-TRADEIN info' to SF 'Line Item'</xsl:comment>
                 
    
        <!-- Trade-in Type -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-type']/ns2:Value != ''">
                <xsl:element name="Trade_in_Type__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-type']/ns2:Value " />
                </xsl:element>
            </xsl:if>
            
        <!-- IMEI  -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-device-imei']/ns2:Value != ''">
                <xsl:element name="IMEI__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-device-imei']/ns2:Value " />
                </xsl:element>
            </xsl:if>
         
        <!-- Carrier  -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-carrier']/ns2:Value != ''">
                <xsl:element name="Carrier__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-carrier']/ns2:Value " />
                </xsl:element>
            </xsl:if>
            
        <!-- Device Make -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-make']/ns2:Value != ''">
                <xsl:element name="Device_Make__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-make']/ns2:Value " />
                </xsl:element>
            </xsl:if>
        
        <!-- Device Model -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-model']/ns2:Value != ''">
                <xsl:element name="Device_Model_Trade_in__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-model']/ns2:Value " />
                </xsl:element>
            </xsl:if>
            
        <!-- Device Condition -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-device-condition']/ns2:Value != ''">
                <xsl:element name="Device_Condition__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-device-condition']/ns2:Value " />
                </xsl:element>
            </xsl:if>
            
        
        <!-- Standard Trade in Value-->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='trade-in-sale-price']/ns2:Value != ''">
                <xsl:element name="Standard_Trade_in_Offer_Value__c">
                    <xsl:value-of select="edx:Fields/edx:Field[ns2:Key='trade-in-sale-price']/ns2:Value " />
                </xsl:element>
            </xsl:if>    
            

    </xsl:template>    
    
    
    <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[(edx:ItemType='ACCESSORY'and edx:Mandatory = 'Y')]">
       
       <xsl:comment>Mapping EP 'ACCESSORY(SIM KIT)' to SF 'Line Item'</xsl:comment>
       
        <!-- Equipment Name -->
        <xsl:if test="edx:DisplayName !=''">
            <xsl:element name="Equipment_Name__c">
                    <xsl:value-of select="edx:DisplayName" />
            </xsl:element>
        </xsl:if>
        
        <!-- Equipment SKU -->
        <xsl:if test="edx:ItemCode !=''">
            <xsl:element name="Equipment_SKU__c">
                    <xsl:value-of select="edx:ItemCode" />
            </xsl:element>
        </xsl:if>
        
        <!-- Equipment Price -->
        <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
            <xsl:element name="Equipment_Price__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value,' USD', '')" />
            </xsl:element>
        </xsl:if>
    </xsl:template>
    
    
    <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='LINE' ]">
    <!--  <records type="Line_Item__c" referenceId="#REFID_PLACE_HOLDER#">-->    
           
            <xsl:comment>Mapping EP 'LINE' to SF 'Line Item'</xsl:comment>
            
            <!-- Line Type mapping based on subtype field-->
            
            <!-- Selected Line on web (Device,Tablet,Wearable) map to MI and Voice for SF-->
	    <xsl:choose>
	        <xsl:when test="edx:Fields/edx:Field[ns2:Key='subtype']/ns2:Value != ''">
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='subtype']/ns2:Value = 'HANDSET'">
		            <xsl:element name="Type_of_line__c">Voice</xsl:element>
		        </xsl:if>
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='subtype']/ns2:Value = 'TABLET'">
		            <xsl:element name="Type_of_line__c">Mobile Internet</xsl:element>
		        </xsl:if>
		        <xsl:if test="edx:Fields/edx:Field[ns2:Key='subtype']/ns2:Value = 'WEARABLE'">
		            <xsl:element name="Type_of_line__c">Mobile Internet</xsl:element>
		        </xsl:if>
	        </xsl:when>
	      </xsl:choose>
        
        
        <!-- Monthly Cost -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'MonthlyPrice' to SF 'Monthly_Cost__c' </xsl:comment>
                <xsl:element name="Monthly_Cost__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
          <!-- Down Payment -->                
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'DueTodayPrice' to SF 'Line_Item__c.Down_Payment__c' </xsl:comment>
                <xsl:element name="Down_Payment__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='PayNowPrice']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Line Deposits-->                
            
              <xsl:comment>Mapping EP 'Line_Deposits' to SF 'total_Line_deposits__c' </xsl:comment>
                <xsl:if test="edx:Fields/edx:Field[ns2:Key='RefundableDepositAmount']/ns2:Value != ''">
                <xsl:comment>Mapping EP 'refundable deposit amount' to SF 'Total_Line_deposits__c' </xsl:comment>
                <xsl:element name="Total_Line_deposits__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='RefundableDepositAmount']/ns2:Value,' USD', '')" />
                </xsl:element>
            </xsl:if>
                
            
    </xsl:template>        
    
    <xsl:template match="edx:Shipments/edx:Shipment/edx:LineItems/edx:LineItem[edx:ItemType='SERVICE' ]">
        <records type="Features__c" referenceId="#REFID_PLACE_HOLDER#">
            
            <xsl:comment>Mapping EP 'SERVICE' to SF 'Feature'</xsl:comment>
            
            <!-- Feature Name -->
            <xsl:if test="edx:DisplayName != ''">
                <xsl:element name="Name">
                    <xsl:value-of select="edx:DisplayName" />
                </xsl:element>
            </xsl:if>
            
            <!-- Feature SKU/SOC  -->
            <xsl:if test="edx:ItemCode != ''">
                <xsl:element name="Feature_SKU__c">
                    <xsl:value-of select="edx:ItemCode" />
                </xsl:element>
            </xsl:if>
            
            <!-- Feature_Price
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:element name="Feature_Price__c">
                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,'USD', '')" />
                </xsl:element>
            </xsl:if>-->

            <!-- Feature Monthly Price -->
            <xsl:if test="edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value != ''">
                <xsl:element name="Feature_Monthly_Price__c">

                    <xsl:value-of select="fn:replace(edx:Fields/edx:Field[ns2:Key='MonthlyPrice']/ns2:Value,'USD', '')" />
                </xsl:element>
            </xsl:if>
            
            <!-- Feature Name -->
            <xsl:if test="edx:DisplayName != ''">
                <xsl:element name="Feature_Name__c">
                    <xsl:value-of select="edx:DisplayName" />
                </xsl:element>
            </xsl:if>
          
        </records>
    </xsl:template>  
    
    <xsl:template match="edx:PaymentMethod">                            
        
        <xsl:comment>Mapping EP 'Payment' to SF 'Payment Information'</xsl:comment>
        
        <!-- Full Name on Card  -->    
        <xsl:element name="Customer_Name_on_the_card__c">
            <xsl:value-of select="edx:CreditCardNameOnAccount" />
        </xsl:element>
        
        <!-- Last 4 of creditcard  -->
            <xsl:element name="Last_4_of_creditcard__c">
                <xsl:value-of select="edx:CreditCardLastFourDigits" />
            </xsl:element>
        
        <!-- Credit Card Expiry date -->
        <xsl:element name="Card_expiration_date__c">
            <xsl:value-of select="format-number(edx:CreditCardExpirationMonth,'00')" />-<xsl:value-of select="format-number(edx:CreditCardExpirationYear,'0000')" />
        </xsl:element>
<!-- <xsl:value-of select="format-number(edx:CreditCardExpirationYear, '0000')" />-<xsl:value-of select="format-number(edx:CreditCardExpirationMonth, '00')" /> -->        
        
        <!-- Card Type  -->
        <xsl:element name="Card_type__c">
            <xsl:value-of select="edx:CreditCardType" />
        </xsl:element>    
        
        <!-- T-safe Alias ID-->
        <xsl:if test="edx:TSafeAlias != ''">
            <xsl:element name="Transaction_ID__c">
                <xsl:value-of select="edx:TSafeAlias" />
            </xsl:element>
        </xsl:if>
        
    </xsl:template>        
    
    <xsl:template match="edx:Payments/edx:Payment">    
    
        <!-- Date and Time Entered -->
    <!-- <xsl:if test="edx:TransactionDate != ''">
            <xsl:element name="Web_Order_Submission_Time__c">
                <xsl:value-of select="edx:TransactionDate" />
            </xsl:element>
        </xsl:if>-->
        
        <!-- JPaymentID-->
        <xsl:if test="edx:jPaymentId != ''">
            <xsl:element name="Web_payment_ID__c">
                <xsl:value-of select="edx:jPaymentId" />
            </xsl:element>
        </xsl:if>
                
        <xsl:apply-templates select="edx:PaymentMethod"/>
        
    </xsl:template>        

</xsl:stylesheet>