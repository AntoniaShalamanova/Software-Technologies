<form>
    Celsius: <input type="text" name="cel"/>
    <input type="submit" value="Convert">
</form>
<form>
    Fahrenheit: <input type="text" name="fah"/>
    <input type="submit" value="Convert">
</form>


<?php
$msg = "";

if (isset($_GET['cel'])) {
    $celsius = $_GET['cel'];
    $fahrenheit = celsiusToFahrenheit($celsius);
    $msg = "$celsius &deg;C = $fahrenheit &deg;F";
}

if (isset($_GET['fah'])) {
    $fahrenheit = $_GET['fah'];
    $celsius = fahrenheitToCelsius($fahrenheit);
    $msg = "$fahrenheit &deg;F = $celsius &deg;C";
}

echo $msg;

function celsiusToFahrenheit(float $celsius): float
{
    return $celsius * 1.8 + 32;
}

function fahrenheitToCelsius(float $fahrenheit): float
{
    return ($fahrenheit - 32) / 1.8;
}

?>