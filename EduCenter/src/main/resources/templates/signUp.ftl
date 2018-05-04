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

<div class="form">

    <div id="sign-up">
        <h1>Sign Up</h1>

        <form action="/signUp" method="post">

            <div class="top-row">
                <div class="field-wrap">
                    <label for="first-name">
                        First Name<span class="req">*</span>
                    </label>
                    <input type="text" required autocomplete="off" id="first-name" name="firstName"/>
                </div>

                <div class="field-wrap">
                    <label for="last-name">
                        Last Name<span class="req">*</span>
                    </label>
                    <input type="text" required autocomplete="off" id="last-name" name="lastName"/>
                </div>
            </div>

            <div class="field-wrap">
                <label for="birth" class="active">
                    Birth<span class="req">*</span>
                </label>
                <input type="date" required autocomplete="off" id="birth" name="birth"/>
            </div>

            <div class="top-row">
                <div class="field-wrap">
                    <label for="city">
                        City
                    </label>
                    <input type="text" required autocomplete="off" id="city" name="city"/>
                </div>

                <div class="field-wrap">
                    <label for="phone-number">
                        Phone number
                    </label>
                    <input type="text" required autocomplete="off" id="phone-number" name="phoneNumber"/>
                </div>
            </div>

            <div class="field-wrap">
                <label for="email">
                    Email Address<span class="req">*</span>
                </label>
                <input type="email" required autocomplete="off" id="email" name="email"/>
            </div>

            <div class="field-wrap">
                <label for="password">
                    Set A Password<span class="req">*</span>
                </label>
                <input type="password" required autocomplete="off" id="password" name="password"/>
            </div>

            <button type="submit" class="button button-block" value="Sign Up"/>
            Sign Up</button>

        </form>

    </div>

</div> <!-- /form -->
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>


<script src="js/index.js"></script>


</body>

</html>