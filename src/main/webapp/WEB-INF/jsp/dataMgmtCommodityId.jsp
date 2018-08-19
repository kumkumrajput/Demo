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
    <form:form class="form-horizontal" method="POST" id="dataMgmtCommodityFormId" modelAttribute="DmCommodityIdBean">
    	<input type="hidden" name="taskName" id="taskNameId" value="${paramIdentifier}"/>
      <div class="container">
      	<div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Commodity ID</div>
		</div>
		        <div class="row">
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="first_name" class="col-sm-3 col-form-label">Commodity ID</label>
		                    <div class="col-sm-9">
		                    	<form:input type="text" class="form-control formElem" id="dmCommodityId" path="commodityId" required="required"/>
		                        
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Type</label>
		                    <div class="col-sm-9">
		                           <form:select class="form-control formElem" id="dmTypeId" path="type">
		                        	<form:options items="${typeMap}" />
							    </form:select>
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Issuer</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="issuerId" path="issuer" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Description</label>
		                    <div class="col-sm-9">
		                    <form:input type="textarea" id="descriptionId" path="description" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		             <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="Street" class="col-sm-3 col-form-label">Exchange</label>
		                    <div class="col-sm-9">
		                    <form:input type="text" id="exchangeId" path="exchange" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		            <div class="form-group form-group-sm col-sm-6">
		                <div class="row">
		                    <label for="last_name" class="col-sm-3 col-form-label">Start Date</label>
		                    <div class="col-sm-9">
		                        <form:input type="date" id="dmStartDateId" path="startDate" required="required" class="form-control formElem"/>
		                    </div>
		                </div>
		            </div>
		            
		            <div class="row" style="float:right;">
		        <button type="button" class="btn btn-primary" onclick="javascript:submitDmCommDetails();">Save</button>
		        </div>
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

function submitDmCommDetails(){
	$('#dataMgmtCommodityFormId').attr('action', '/commodity/commoditydetails/data/savecommodity');
	$('#dataMgmtCommodityFormId').submit();
}	
</script>
</html>