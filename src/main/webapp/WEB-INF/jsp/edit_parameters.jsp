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
		        <div class="row" style="padding-bottom: 10px;">
		        	<c:if test="${paramIdentifier eq 'editfutures'}">
				  		<div class="col heading">Edit Futures</div>
				  	</c:if>
				  	<c:if test="${paramIdentifier eq 'editlisted'}">
				  		<div class="col heading">Edit Listed Options</div>
				  	</c:if>
				  	<c:if test="${paramIdentifier eq 'editforwards'}">
				  		<div class="col heading">Edit Forwards</div>
				  	</c:if>
				  	<c:if test="${paramIdentifier eq 'editswaps'}">
				  		<div class="col heading">Edit Swaps</div>
				  	</c:if>
				</div>
				
				<c:if test="${paramIdentifier eq 'editfutures'}">
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
				                <th>Action</th>
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'editlisted'}">
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
				                <th>Action</th>
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'editswaps'}">
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
				                <th>Action</th>
				                
				            </tr>
				        </thead>
				        <tbody>
				        </tbody>
		        	</table>
				</div>
				</c:if>
				
				<c:if test="${paramIdentifier eq 'editforwards'}">
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
				                <th>Action</th>
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
  	            { "data": "contractDate" },
  	          	{ "data": "id",
  	            	"render": function ( data, type, row ) {
  	            		var agreementNo = row["ack"];
  	            		var hrefUrl = "/commodity/commoditydetails/getfutures/editparameter/editfutures/" + data +"/"+ agreementNo;
  	            	   var formattedData = '<a href='+hrefUrl+'>Edit</a>';
  	                     return formattedData;
  	                 }
  	            }
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
	          	{ "data": "callPutt" },
	          	{ "data": "id",
  	            	"render": function ( data, type, row ) {
  	            		var agreementNo = row["ack"];
  	            		var hrefUrl = "/commodity/commoditydetails/getfutures/editparameter/editlisted/" + data +"/"+ agreementNo;
   	            	   var formattedData = '<a href='+hrefUrl+'>Edit</a>';
  	                     return formattedData;
  	                 }
  	            }
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
  	            { "data": "spotPrice" },
  	          { "data": "id",
  	            	"render": function ( data, type, row ) {
  	            		var agreementNo = row["ack"];
  	            		var hrefUrl = "/commodity/commoditydetails/getfutures/editparameter/editforwards/" + data +"/"+ agreementNo;
    	            	   var formattedData = '<a href='+hrefUrl+'>Edit</a>';
  	                     return formattedData;
  	                 }
  	            }
  	            
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
  	            { "data": "eDateSell" },
  	          { "data": "id",
  	            	"render": function ( data, type, row ) {
  	            		var agreementNo = row["ack"];
  	            	   var formattedData = '<a href="#" onclick="javascript:editParameters(\''+data+'\');">Edit</a>';
  	                     return formattedData;
  	                 }
  	            }
  	        ]
  	    });
      }
      function getDataTableData(){
    	  debugger;
    	  var finalUrl;
    	  
    	  if(paramValue == 'editfutures'){
    		  finalUrl = "http://localhost:8080/commodity/api/futures/getdata";
    	  }else if(paramValue == 'editlisted'){
    		  finalUrl = "http://localhost:8080/commodity/api/listed/getdata";
    	  }else if(paramValue == 'editforwards'){
    		  finalUrl = "http://localhost:8080/commodity/api/forwards/getdata";
    	  }else if(paramValue == 'editswaps'){
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
  				if(paramValue == 'editfutures'){
  					getFuturesDataTable(result.data.futures);
  	    	  }else if(paramValue == 'editlisted'){
  	    		getListedOptionsDataTable(result.data.listedOptions);
  	    	  }else if(paramValue == 'editforwards'){
  	    		getForwardsDataTable(result.data.forwards);
  	    	  }else if(paramValue == 'editswaps'){
  	    		getSwapsDataTable(result.data.swaps);
  	    	  }
  			},
  			error : function(e) {
  				console.log("ERROR: ", e);
  			}
  		});	
      }
    </script>
    
</body>

</html>