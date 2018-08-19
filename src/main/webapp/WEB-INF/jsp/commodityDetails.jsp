<html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <c:url value="/css/album.css" var="albumCss" />
    <c:url value="/css/datatable.min.css" var="dataTableCss" />
    <c:url value="/css/main.css" var="mainCss" />
    <c:url value="/css/bootstrap/mdb.min.css" var="mdbCss" />
     <c:url value="/css/bootstrap/bootstrap.min.css" var="bootstrapMinCss" />
    
    <c:url value="/js/datatable/datatable.min.js" var="datatableMinJS"/>
    <c:url value="/js/holder.min.js" var="holderjs" />
    <c:url value="/js/jquery-3.3.1.js" var="jqueryJS" />
    <c:url value="/js/jquery-3.3.1.min.js" var="jqueryMinJS" />
    <c:url value="/js/bootstrap/bootstrap.min.js" var="bootstrapMinJS" />
     
    <link href="${mainCss}" rel="stylesheet" />
    <link href="${bootstrapMinCss}" rel="stylesheet" />
	<link href="${albumCss}" rel="stylesheet" />
	<link href="${fontAwesomeCss}" rel="stylesheet" />
	<link href="${mdbCss}" rel="stylesheet" />
	<link href="${dataTableCss}" rel="stylesheet" />
	
</head>

<body>
	<%@ include file = "header.jspf" %>

    <div class="album text-muted">
    <form:form class="form-horizontal" method="POST" modelAttribute="commodityBean" id="commodityFormId">
    	<input type="hidden" name="taskName" id="taskNameId" value="${paramIdentifier}"/>
      <div class="container">
      	<div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Parameters</div>
		</div>
		        <div class="row">
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="first_name" class="col-sm-3 col-form-label">Commodity ID</label>
		                    <div class="col-sm-9">
		                        <form:select class="form-control formElem" id="commodityId" path="commodityId">
		                        	<form:options items="${commodityIdMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="last_name" class="col-sm-3 col-form-label">Start Date</label>
		                    <div class="col-sm-9">
		                        <form:input type="date" class="form-control formElem" id="startDateId" name="startDate" path="startDate" />
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Exchange</label>
		                    <div class="col-sm-9">
		                        <form:select class="form-control formElem" id="exchangeId" path="exchange" >
		                        	<form:options items="${exchangeMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="City" class="col-sm-3 col-form-label">End Date</label>
		                    <div class="col-sm-9">
		                        <form:input type="date" class="form-control formElem" id="endDateId" name="endDate" path="endDate" />
		                    </div>
		                </div>
		            </div>
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Counter Party</label>
		                    <div class="col-sm-9">
		                        <form:select class="form-control formElem" id="counterPartyId" path="counterParty" >
		                        	<form:options items="${counterPartyMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		             <c:if test="${paramIdentifier eq 'futures'}">
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Future Price</label>
		                    <div class="col-sm-9">
		                        <%-- <form:select class="form-control formElem" id="futurePriceId" path="futurePrice" >
		                        	<form:options items="${futurePriceMap}" />
							    </form:select> --%>
							    <form:input path="futurePrice"/>
		                    </div>
		                </div>
		            </div>
		            </c:if>
		             <c:if test="${paramIdentifier eq 'forwards'}">
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Forward Price</label>
		                    <div class="col-sm-9">
		                        <%-- <form:select class="form-control formElem" id="forwardPriceId" path="forwardPrice" >
		                        	<form:options items="${forwardPriceMap}" />
							    </form:select> --%>
							    <form:input path="forwardPrice"/>
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Spot Price</label>
		                    <div class="col-sm-9">
		                        <%-- <form:select class="form-control formElem" id="spotPriceId" path="spotPrice" >
		                        	<form:options items="${spotPriceMap}" />
							    </form:select> --%>
							    <form:input path="spotPrice"/>
		                    </div>
		                </div>
		            </div>
		            </c:if>
		            <%-- <c:out value="${paramIdentifier}"/> --%>
		            <c:if test="${paramIdentifier eq 'listedOptions'}">
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Option Premium</label>
		                    <div class="col-sm-9">
		                        <%-- <form:select class="form-control formElem" id="optionPremiumId" path="optionPremium" >
		                        	<form:options items="${optionPremiumMap}" />
							    </form:select> --%>
							    <form:input path="optionPremium"/>
		                    </div>
		                </div>
		            </div>
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Maturity Date</label>
		                    <div class="col-sm-9">
		                    	 <form:input type="date" class="form-control formElem" id="maturityId" name="maturity" path="maturity" />
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Strike Price</label>
		                    <div class="col-sm-9">
		                    	 <%-- <form:select class="form-control formElem" id="strikePriceId" path="strikePrice" >
		                        	<form:options items="${strikePriceMap}" />
							    </form:select> --%>
							    <form:input path="strikePrice"/>
		                    </div>
		                </div>
		            </div>
		            <%--  <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Call</label>
		                    <div class="col-sm-9">
		                    	 <form:radiobutton path="strikePriceOption" value="call" class="form-control formElem"/>
		                    </div>
		                </div>
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Putt</label>
		                    <div class="col-sm-9">
		                    	 <form:radiobutton path="strikePriceOption" value="putt" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div> --%>
		           </c:if>
		        </div>
		  
        <div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Contract Data</div>
		</div>
				<div class="row">
				<c:if test="${paramIdentifier ne 'swaps'}">
					<div class="form-group form-group-sm col-sm-6">
						<div class="row">
							<label for="first_name" class="col-sm-3 col-form-label">Type
								of Investment</label>
							<div class="col-sm-9">
								<form:select class="form-control formElem"
									id="typeOfInvestmentId"
									path="contractDataBean.typeOfInvestment">
									<form:options items="${investmentTypeMap}" />
								</form:select>
							</div>
						</div>
					</div>
					</c:if>
					<c:if test="${paramIdentifier eq 'swaps'}">
					<div class="form-group form-group-sm col-sm-6">
						<div class="row">
							<label for="middle_name" class="col-sm-3 col-form-label">Type of Trade</label>
							<div class="col-sm-9">
								<form:select class="form-control formElem"
									id="typeOfInvestmentId"
									path="contractDataBean.typeOfTrade">
									<form:options items="${tradeTypeMap}" />
								</form:select>
							</div>
						</div>
					</div>
					</c:if>
					<div class="form-group form-group-sm col-sm-6">
						<div class="row">
							<label for="last_name" class="col-sm-3 col-form-label">Contract
								Date</label>
							<div class="col-sm-9">
								<form:input type="date" class="form-control formElem"
									id="contractDateId" name="contractDate"
									path="contractDataBean.contractDate" />
							</div>
						</div>
					</div>
					
				</div>
				<div class="row" style="float:right;">
		        <button type="button" class="btn btn-primary" onclick="javascript:submitTask();">Save</button>
		        </div>
		        
		        <div class="row" style="padding-bottom: 10px; margin-top:150px;">
				  <div class="col heading">Records</div>
				</div>
				
				<c:if test="${paramIdentifier eq 'futures'}">
				<div class="row">
					<table id="recordsDTableId" class="display" style="width:100%">
				        <thead>
				            <tr>
				                <th>Acknowledge Number</th>
				                <th>Commodity Id</th>
				                <th>Counter Party</th>
				                <th>Start Date</th>
				                <th>End Date</th>
				                <th>Future Price</th>
				                <th>Type of Investment</th>
				                <th>Contract Date</th>
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'listedOptions'}">
				<div class="row">
					<table id="recordsDTableId" class="display" style="width:100%">
				        <thead>
				            <tr>
				                <th>Acknowledge Number</th>
				                <th>Commodity Id</th>
				                <th>Exchange</th>
				                <th>Counter Party</th>
				                <th>Start Date</th>
				                <th>Maturity Date</th>
				                <th>Type of Investment</th>
				                <th>Contract Date</th>
				                <th>Option Premium</th>
				                <th>Strike Price</th>
				                <th>Call/Putt</th>
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'swaps'}">
				<div class="row">
					<table id="recordsDTableId" class="display" style="width:100%">
				        <thead>
				            <tr>
				                <th>Acknowledge Number</th>
				                <th>Commodity Id</th>
				                <th>Exchange</th>
				                <th>Counter Party</th>
				                <th>Start Date</th>
				                <th>End Date</th>				                
				                <th>Type of Trade</th>
				                <th>Contract Date</th>				                
				                 <th>Commodity Fixed Price</th>
				                <th>Effective Date Of Buying</th>				                
				                <th>Commodity Floating Price</th>
				                <th>Effective Date Of Selling</th>
				                
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'forwards'}">
				<div class="row">
					<table id="recordsDTableId" class="display" style="width:100%">
				        <thead>
				            <tr>
				                <th>Acknowledge Number</th>
				                <th>Commodity Id</th>
				                <th>Exchange</th>
				                <th>Counter Party</th>
				                <th>Start Date</th>
				                <th>End Date</th>
				                <th>Type of Investment</th>
				                <th>Contract Date</th>
				                <th>Forward Price</th>
				                <th>Spot Price</th>
				                
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
      </div>
      </form:form>
    </div>
    
    <!-- include popup -->
    <jsp:include page="popup.jsp"></jsp:include>
    
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="webjars/bootstrap/4.0.0/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="${holderjs}"></script>
    <script src="${jqueryJS}"></script>
    <script src="${jqueryMinJS}"></script>
     <script src="${bootstrapMinJS}"></script>
    <script src="${datatableMinJS}"></script>
    
    <script>
    var futuresData;
    var paramValue = '${paramIdentifier}';
    console.log('----param value -----' + paramValue);
      $(function () {
        Holder.addTheme("thumb", { background: "#55595c", foreground: "#eceeef", text: "Thumbnail" });
      });
      
      $(document).ready(function() {
    	  getDataTableData();
    	} );

      function getFuturesDataTable(futuresData){
    	  var table = $('#recordsDTableId').DataTable({
  	        "data": futuresData,
  	        "destroy":true,
  	        "pagingType": "full_numbers",
  	         "oLanguage": {
  	                "oPaginate": {
  	                    "sFirst": "First",
  	                    "sLast": "Last",
  	                    "sNext": "Next",
  	                    "sPrevious": "Previous"
  	                }
  	            },
  	        "columns": [
  	            { "data": "ack" },
  	            { "data": "commodityId" },
  	            { "data": "counterParty" },
  	            { "data": "startDate" },
  	            { "data": "endDate"},
  	            { "data": "futurePrice" },
  	            { "data": "investType" },
  	            { "data": "contractDate" }
  	        ]
  	    });
      }
      
      
      function getListedOptionsDataTable(futuresData){
    	  var table = $('#recordsDTableId').DataTable({
  	        "data": futuresData,
  	        "destroy":true,
  	        "pagingType": "full_numbers",
  	         "oLanguage": {
  	                "oPaginate": {
  	                    "sFirst": "First",
  	                    "sLast": "Last",
  	                    "sNext": "Next",
  	                    "sPrevious": "Previous"
  	                }
  	            },
  	        "columns": [
  	            { "data": "ack" },
  	            { "data": "commodityId" },
  	          	{ "data": "exchange" },
  	            { "data": "counterParty" },
  	            { "data": "startDate" },
  	            { "data": "maturityDate"},
  	            { "data": "investType" },
  	            { "data": "contractDate" },
  	          	{ "data": "option" },
  	          	{ "data": "strikePrice" },
	          	{ "data": "callPutt" }
  	        ]
  	    });
      }
      
      function getForwardsDataTable(futuresData){
    	  var table = $('#recordsDTableId').DataTable({
  	        "data": futuresData,
  	        "destroy":true,
  	        "pagingType": "full_numbers",
  	         "oLanguage": {
  	                "oPaginate": {
  	                    "sFirst": "First",
  	                    "sLast": "Last",
  	                    "sNext": "Next",
  	                    "sPrevious": "Previous"
  	                }
  	            },
  	        "columns": [
  	            { "data": "ack" },
  	            { "data": "commodityId" },
  	            { "data": "exchange" },
  	            { "data": "counterParty" },
  	            { "data": "startDate" },
  	            { "data": "endDate"},
  	            { "data": "investType" },
	            { "data": "contractDate" },
  	            { "data": "forwardPrice" },
  	            { "data": "spotPrice" }
  	            
  	        ]
  	    });
      }
      
      function getSwapsDataTable(futuresData){
    	  var table = $('#recordsDTableId').DataTable({
  	        "data": futuresData,
  	        "destroy":true,
  	        "pagingType": "full_numbers",
  	         "oLanguage": {
  	                "oPaginate": {
  	                    "sFirst": "First",
  	                    "sLast": "Last",
  	                    "sNext": "Next",
  	                    "sPrevious": "Previous"
  	                }
  	            },
  	        "columns": [
  	            { "data": "ack" },
  	            { "data": "commodityId" },
  	            { "data": "exchange" },
  	            { "data": "counterParty" },
  	            { "data": "startDate" },
  	            { "data": "endDate"},
  	            { "data": "tradeType" },
	            { "data": "contractDate" },  	          
  	            { "data": "commFixed" },
  	            { "data": "eDateBuy" },
  	            { "data": "commFloat" },
  	            { "data": "eDateSell" }
  	        ]
  	    });
      }
      function getDataTableData(){
    	  debugger;
    	  var finalUrl;
    	  
    	  if(paramValue == 'futures'){
    		  finalUrl = "http://localhost:8080/commodity/api/futures/getdata";
    	  }else if(paramValue == 'listedOptions'){
    		  finalUrl = "http://localhost:8080/commodity/api/listed/getdata";
    	  }else if(paramValue == 'forwards'){
    		  finalUrl = "http://localhost:8080/commodity/api/forwards/getdata";
    	  }else if(paramValue == 'swaps'){
    		  finalUrl = "http://localhost:8080/commodity/api/swaps/getdata";
    	  }
    	  $.ajax({
  			type : "GET",
  			url : finalUrl,
  			success: function(result){
  				debugger;
  				console.log(result);
  				console.log(result);
  				console.log(result.data);
  				if(paramValue == 'futures'){
  					getFuturesDataTable(result.data.futures);
  	    	  }else if(paramValue == 'listedOptions'){
  	    		getListedOptionsDataTable(result.data.listedOptions);
  	    	  }else if(paramValue == 'forwards'){
  	    		getForwardsDataTable(result.data.forwards);
  	    	  }else if(paramValue == 'swaps'){
  	    		getSwapsDataTable(result.data.swaps);
  	    	  }
  			},
  			error : function(e) {
  				console.log("ERROR: ", e);
  			}
  		});	
      }
      function submitTask(){
    	  console.log('submit task');
    	  var action = $('#taskNameId').val();
    	  console.log('--action---:: ' + action);
    	  
    	  if(action == 'listedOptions'){
    		  $('#modalBodyId').html("Agreement number 2000000000 is created.");
    		  $('#commodityFormId').attr('action', '/commodity/commoditydetails/listed/submit');
  			$('#commodityFormId').submit();
    	  }
    	  else if(action == 'forwards'){
    		  $('#modalBodyId').html("Agreement number 3000000000 is created.");
    		  $('#commodityFormId').attr('action', '/commodity/commoditydetails/forwards/submit');
    			$('#commodityFormId').submit();
    	  }
    	  else if(action == 'swaps'){
    		  $('#modalBodyId').html("Agreement number 4000000000 is created.");
    		  $('#commodityFormId').attr('action', '/commodity/commoditydetails/swaps/submit');
  			$('#commodityFormId').submit();
    	  }
    	  else{
    		  $('#modalBodyId').html("Agreement number 1000000000 is created.");
    		  $('#commodityFormId').attr('action', '/commodity/commoditydetails/futures/submit');
    			$('#commodityFormId').submit();
    	  }
    	  $('#myModal').modal('show');
    	 /*  var submitFormUrl;
    	 $.ajax({
				url : '/commodity/commoditydetails/submit',
				type : "POST",
				success : function(data, textStatus, jqXHR) {
					console.log('data :: ' + data);
				},
				error : function(jqXHR, textStatus, errorThrown) {
				}
			});  */
		//	$.post('/commodity/commoditydetails/submit', $("#commodityFormId").serialize());
      }
    </script>
    
</body>

</html>