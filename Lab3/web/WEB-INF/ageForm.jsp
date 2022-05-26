<!DOCTYPE html>
<html>
    <head>
        <title>Age Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Age Calculator</h2>
        <form method="POST" action = "age">
             <label for="age">Enter your age:</label>
            <input type="text" id = "age" name="age" value="${age}">
            <br>
            <div><input type ="submit" value="Age next birthday"></div>
            <p>${result}</p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
