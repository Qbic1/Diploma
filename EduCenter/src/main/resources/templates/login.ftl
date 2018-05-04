<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Sign-Up/Login Form</title>
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

    <link rel="stylesheet" href="css/style.css">


</head>

<body>

<#if error??>
<div class="alert">
    <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
    Wrong login or password!
</div>
</#if>

<div class="form">

    <div id="login">
        <h1>Welcome Back!</h1>

        <form action="/login" method="post">

            <div class="field-wrap">
                <label>
                    Email Address<span class="req">*</span>
                </label>
                <input name="email" type="email" required autocomplete="off"/>
            </div>

            <div class="field-wrap">
                <label>
                    Password<span class="req">*</span>
                </label>
                <input type="password" name="password" required autocomplete="off"/>
            </div>

            <!--<label for="remember-me">
                <input type="checkbox" id="remember-me" name="remember-me">Remember
            </label>-->

            <h1 class="signUp"><a href="/signUp">Sign Up</a></h1>

            <p class="forgot"><a href="#">Forgot Password?</a></p>

            <button class="button button-block"/>
            Log In</button>

        </form>

    </div>

</div> <!-- /form -->
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>


<script src="js/index.js"></script>


</body>

</html>
