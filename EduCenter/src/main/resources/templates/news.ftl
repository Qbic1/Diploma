<#ftl encoding='UTF-8'>
<html>
<head>
    <title>RED - education center</title>
</head>

<body>

<#list newsList as news>
<div>
    <b style="font-size: 20px">${news.title}</b>
</div>
<div>
    ${news.description}
</div>
<div>
    ${news.date}
</div>
<hr>
</#list>

<form method="post" action="/news">
    <label for="title">
        Title
    </label>
    <input type="text" required id="title" name="title"/>

    <label for="description">
        Description
    </label>
    <input type="text" required id="description" name="description"/>


    <button type="submit" value="Add news"/>
    Add news</button>
</form>
</body>
</html>