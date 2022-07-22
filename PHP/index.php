<?php
require_once('Account.php');
require_once('./Car/CarTypes/uberX.php');
require_once('./Car/CarTypes/UberPool.php');
require_once('Payments/Card.php');

$uberX = new UberX('XYZ1234', new Account('Alejandro Martin', '1234Z'), 'Opel', 'Corsa');
$uberX->printDataCar();

$uberPool = new UberPool('ZAQ3455', new Account('Laura Hernandez', '4830K'), 'Porche', 'Chayan');
$uberPool->printDataCar();

$payment = new Card(1, 1234567891233, 123, '12/22');
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
    <?php foreach ($payment as $key => $value) {
        echo $value .'\n';
    }?>
</body>
</html>