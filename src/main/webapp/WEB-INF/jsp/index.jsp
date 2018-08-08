<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
	<c:url value="/css/login.css" var="loginCss" />
	
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0/css/layout.css" />
    <link href="${loginCss}" rel="stylesheet" />
    
    <script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container">
  
  <div class="row" id="pwd-container">
    <div class="col-md-4"></div>
    
    <div class="col-md-4">
      <section class="login-form">
        <form method="post" action="/commodity/home" role="login">
          <img src="http://i.imgur.com/RcmcLv4.png" class="img-responsive" alt="" />
          <input type="email" name="username" placeholder="Username" required class="form-control input-lg" />
          
          <input type="password" class="form-control input-lg" id="password" name="password" placeholder="Password" required="" />
          
          
          <div class="pwstrength_viewport_progress"></div>
          
          
          <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button>
          
        </form>
        
      </section>  
      </div>
      
      <div class="col-md-4"></div>
      

  </div>
  
</div>
</body>

</html>