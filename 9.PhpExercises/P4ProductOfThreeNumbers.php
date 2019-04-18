<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    X: <input type="text" name="num1"/>
    Y: <input type="text" name="num2"/>
    Z: <input type="text" name="num3"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num1']) && isset($_GET['num2'])) {
    $num1 = intval($_GET['num1']);
    $num2 = intval($_GET['num2']);
    $num3 = intval($_GET['num3']);
    $arr = array($num1, $num2, $num3);

    $zeros = array_filter($arr, function (int $x): int {
        return $x == 0;
    });

    $negative = array_filter($arr, function (int $x): int {
        return $x < 0;
    });

    if (count($zeros) > 0) {
        echo "positive";
        return;
    } else {
        if (count($negative) % 2 == 0) {
            echo "positive";
            return;
        } else {
            echo "negative";
            return;
        }
    }
}
?>
</body>
</html>