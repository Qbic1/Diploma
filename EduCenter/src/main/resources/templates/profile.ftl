<#ftl encoding='UTF-8'>
<html>
<head>
    <title>RED - education center</title>
</head>

<body>

<div>
    <label>First name</label>
${client.firstName}
</div>
<hr>
<div>
    <label>Last name</label>
${client.lastName}
</div>
<hr>
<div>
    <label>Birth</label>
${client.birth}
</div>
<hr>
<div>
    <label>Email</label>
${client.email}
</div>
<hr>
<div>
    <label>City</label>
${client.city}
</div>
<hr>
<div>
    <label>Phone number</label>
${client.phoneNumber}
</div>
<hr>
<a href="/mycourses"><input type="submit" value="Your courses"></a>

<a href="/settings"><input type="submit" value="Edit"></a>
<a href="/delete"><input type="submit" value="Delete profile"></a>

</body>
</html>