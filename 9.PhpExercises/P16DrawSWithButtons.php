<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
for ($rows = 1; $rows <= 9; $rows++) {
    if ($rows == 1 || $rows == 5 || $rows == 9) {
        for ($cols = 1; $cols <= 5; $cols++) {
            echo "<button style='background-color: #4f4fff'> 1 </button>";
        }
        echo "<br>";
    } else if ($rows >= 2 && $rows <= 4) {
        echo "<button style='background-color: #4f4fff'> 1 </button>";

        for ($cols = 2; $cols <= 5; $cols++) {
            echo "<button> 0 </button>";
        }
        echo "<br>";
    }
    else if ($rows >= 6 && $rows <= 8) {
        for ($cols = 1; $cols <= 4; $cols++) {
            echo "<button> 0 </button>";
        }
        echo "<button style='background-color: #4f4fff'> 1 </button><br>";
    }
}
?>
</body>
</html>