<html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
    <c:url value="/css/bootstrap/font-awesome.css" var="fontAwesomeCss" />
    <c:url value="/css/bootstrap/bootstrap.min.css" var="bootstrapMinCss" />
    
    <link href="${bootstrapMinCss}" rel="stylesheet" />
	<link href="${albumCss}" rel="stylesheet" />
	<link href="${mainCss}" rel="stylesheet" />
	<link href="${fontAwesomeCss}" rel="stylesheet" />
	<link href="${mdbCss}" rel="stylesheet" />
</head>

<body>
	<%@ include file = "header.jspf" %>

    <div class="album text-muted">
      <div class="container">
      	<div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Hedging</div>
		</div>

        <div class="row">
          <div class="card">
            	<div class="boxElem"> <span class="boxElemSpan"><a href="/commodity/commoditydetails/futures">Futures</a></span> </div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/listedOptions">Listed Options</a></span> </div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/forwards">Forwards</a> </span></div>
          </div>

          <div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/swaps">Swaps</a></span> </div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan">OTC Options </span></div>
          </div>
<!--           <div class="card"> -->
<!--             <div class="boxElem"><span class="boxElemSpan">Data Management </span></div> -->
<!--           </div> -->
        </div>
        
        <div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Procurement</div>
		</div>
		<div class="row">
		<div class="card">
            <div class="boxElem"><span class="boxElemSpan">Create Purchase </span></div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan">Inventory </span></div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan">Market Prices </span></div>
          </div>
          </div>
          
          <div class="row" style="    padding-bottom: 10px;">
		  <div class="col heading">Data Management</div>
		</div>
		<div class="row">
		<div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/data/commodityid">Commodity ID</a> </span></div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/data/counterparty/masterdata">CounterParty MasterData</a> </span></div>
          </div>
          <div class="card">
            <div class="boxElem"><span class="boxElemSpan"><a href="/commodity/commoditydetails/data/pricedata">Commodity Price Data</a> </span></div>
          </div>
          </div>
		
		
      </div>
    </div>
    
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
    </script>
    <script src="${bootstrapMinJS}"></script>
</body>

</html>