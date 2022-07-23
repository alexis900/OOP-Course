<?php
require_once('./AccountType/Driver.php');
require_once('./Car/CarTypes/uberX.php');
require_once('./Car/CarTypes/UberPool.php');
require_once('Payments/Card.php');


$driver1 = new Driver('Alejandro Martin', '1234Z', 'driver1@uber.net', true);
$uberX = new UberX('XYZ1234', $driver1, 'Opel', 'Corsa');
$uberX->printDataCar();
$driver1->printDataUser();

$driver2 = new Driver('Laura Hernandez', '4830K', 'driver2@uber.net', false);
$uberPool = new UberPool('ZAQ3455', $driver2, 'Porche', 'Chayan');
$uberPool->printDataCar();
$driver2->printDataUser()

//$payment = new Card(1, 1234567891233, 123, '12/22');

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
</body>
</html>