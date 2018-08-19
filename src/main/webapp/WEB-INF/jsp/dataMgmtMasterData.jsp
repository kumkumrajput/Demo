<html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
	<title>Insert title here</title>
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
    <form:form class="form-horizontal" method="POST" id="dataMgmtFormId" modelAttribute="DmMasterDataBean">
    	<input type="hidden" name="taskName" id="taskNameId" value="${paramIdentifier}"/>
      <div class="container">
      	<div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Counter Party Master Data</div>
		</div>
		        <div class="row">
		        
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="first_name" class="col-sm-3 col-form-label">CounterParty</label>
		                    <div class="col-sm-9">
		                    	<form:input type="text" class="form-control formElem" id="dmCounterPartyId" path="counterPartyId" required="required"/>
		                        
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Name</label>
		                    <div class="col-sm-9">
		                        <form:input type="text" id="dmNameId" path="name" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Address</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="addressId" path="address" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		           
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Bank A/C</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="bankAcId" path="bankAcc" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		           <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Bank Name</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="bankNameId" path="bankName" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Contact Person</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="contactPersonId" path="contactPerson" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		              <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Authorization</label>
		                    <div class="col-sm-9 checkboxDivClass">
		                    	<form:checkboxes path="auth" items="${authCheckboxes}" class="checkboxClass"/>
		                    </div>
		                </div>
		            </div>
		        </div> 
		        <div class="row" style="float:right;     margin-top: 170px;">
		        		<button type="button" class="btn btn-primary" onclick="javascript:submitDMDetails();">Save</button>
		        	</div>  
		    </div>        
		        </form:form>
		            
    </div>


</body>
 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="webjars/bootstrap/4.0.0/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="${holderjs}"></script>
    
<script>

function submitDMDetails(){
	$('#dataMgmtFormId').attr('action', '/commodity/commoditydetails/data/saveMaster');
	$('#dataMgmtFormId').submit();
}	
</script>
</html>