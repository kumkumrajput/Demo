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
    <c:url value="/css/main.css" var="mainCss" />
    <c:url value="/js/holder.min.js" var="holderjs" />
    <c:url value="/js/bootstrap/bootstrap.min.js" var="bootstrapMinJS" />
     <c:url value="/css/bootstrap/mdb.min.css" var="mdbCss" />
     <c:url value="/css/bootstrap/bootstrap.min.css" var="bootstrapMinCss" />
    
    <link href="${mainCss}" rel="stylesheet" />
    <link href="${bootstrapMinCss}" rel="stylesheet" />
	<link href="${albumCss}" rel="stylesheet" />
	<link href="${fontAwesomeCss}" rel="stylesheet" />
	<link href="${mdbCss}" rel="stylesheet" />
	
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
		                        <form:select class="form-control formElem" id="futurePriceId" path="futurePrice" >
		                        	<form:options items="${futurePriceMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		            </c:if>
		             <c:if test="${paramIdentifier eq 'forwards'}">
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Forward Price</label>
		                    <div class="col-sm-9">
		                        <form:select class="form-control formElem" id="forwardPriceId" path="forwardPrice" >
		                        	<form:options items="${forwardPriceMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Spot Price</label>
		                    <div class="col-sm-9">
		                        <form:select class="form-control formElem" id="spotPriceId" path="spotPrice" >
		                        	<form:options items="${spotPriceMap}" />
							    </form:select>
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
		                        <form:select class="form-control formElem" id="optionPremiumId" path="optionPremium" >
		                        	<form:options items="${optionPremiumMap}" />
							    </form:select>
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
		                    	 <form:select class="form-control formElem" id="strikePriceId" path="strikePrice" >
		                        	<form:options items="${strikePriceMap}" />
							    </form:select>
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
    <script>
      $(function () {
        Holder.addTheme("thumb", { background: "#55595c", foreground: "#eceeef", text: "Thumbnail" });
      });
      
      function submitTask(){
    	  console.log('submit task');
    	  var action = $('#taskNameId').val();
    	  console.log('--action---:: ' + action);
    	  
    	  if(action == 'listedOptions'){
    		  $('#modalBodyId').html("Agreement number 2000000000 is created.");
    	  }else if(action == 'forwards'){
    		  $('#modalBodyId').html("Agreement number 3000000000 is created.");
    	  }else if(action == 'swaps'){
    		  $('#modalBodyId').html("Agreement number 4000000000 is created.");
    	  }else{
    		  $('#modalBodyId').html("Agreement number 1000000000 is created.");
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
    <script src="${bootstrapMinJS}"></script>
</body>

</html>