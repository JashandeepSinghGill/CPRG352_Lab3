<!DOCTYPE html>
<html>
    <head>
        <title>Arithmetic Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Arithmetic Calculator</h2>
        <form method="POST" action = "arithmetic">
            <label for="one">First:</label>
            <input type="text" id = "one" name="first" value = ${first}>
            <label for="two">Second:</label>
            <input type="text" id = "two" name="second" value = ${second}>
            <br>
            <div>
            <input type ="submit" name="operator" value="+">
            <input type ="submit" name="operator" value="-">
            <input type ="submit" name="operator" value="*">
            <input type ="submit" name="operator" value="%">
            </div>
            <p>Result: ${result}</p>
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
