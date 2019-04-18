<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style>
</head>
<body>
<table>
    <?php

    for ($rowColorIndx = 0; $rowColorIndx <= 255; $rowColorIndx += 51) {

        for ($colColorIndx = $rowColorIndx; $colColorIndx <= $rowColorIndx + 45; $colColorIndx += 5) {
            echo "<div style='background-color: rgb($colColorIndx, $colColorIndx, $colColorIndx)'></div>";
        }

        echo "<br>";

    }
    ?>
</table>
</body>
</html>