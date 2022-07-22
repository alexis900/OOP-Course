<?php

require_once 'Car/Car.php';
require_once 'Account.php';

$car = new Car('ABC-1234', new Account('Andrés Herrera', '123.456.789-09'));

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php $car->printDataCard();   ?>
</body>
</html>