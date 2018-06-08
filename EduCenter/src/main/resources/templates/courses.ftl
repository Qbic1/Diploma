<#ftl encoding='UTF-8'>
<html>
<head>
    <title>RED - education center</title>
</head>

<body>

<#if added??>
<div class="alert">
    <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
    You enroll for a course!
</div>
</#if>

<#list courses as course>
<div>
    <b style="font-size: 20px">${course.title}</b>
</div>
<hr>
<div>
    <label>Description</label>
    ${course.description}
</div>
<hr>
<div>
    <label>Start date</label>
    ${course.dateStart}
</div>
<hr>
<div>
    <label>Finish date</label>
    ${course.dateFinish}
</div>
<hr>
<div>
    <label>Status</label>
    ${course.status}
</div>
<a href="/courses/${course.title}">Enroll</a>
<hr>
</#list>

<form method="post" action="/courses">
    <label for="title">
        Title
    </label>
    <input type="text" required id="title" name="title"/>

    <label for="description">
        Description
    </label>
    <input type="text" required id="description" name="description"/>

    <label for="date-start">
        Date Start
    </label>
    <input type="date" required id="date-start" name="dateStart"/>

    <label for="date-finish">
        Date Finish
    </label>
    <input type="date" required id="date-finish" name="dateFinish"/>

    <button type="submit" value="Add course"/>
    Add course</button>
</form>
</body>
</html>