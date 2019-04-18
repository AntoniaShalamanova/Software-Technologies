<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
function isPrime($currentNum, $currentNumSquare)
{
    $isPrime = true;

    for ($i = 2; $i <= $currentNumSquare; $i++) {
        if ($currentNum % $i == 0) {
            $isPrime = false;
            break;
        }

    }
    return $isPrime;
}

if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    for ($currentNum = $num; $currentNum > 1; $currentNum--) {
        $currentNumSquare = sqrt($currentNum);

        if (isPrime($currentNum, $currentNumSquare)) {
            echo $currentNum . " ";
        }
    }
}
?>
</body>
</html>