<?php
require_once('Account.php');
require_once('uberX.php');
require_once('UberPool.php');

$uberX = new UberX('XYZ1234', new Account('Alejandro Martin', '1234Z'), 'Opel', 'Corsa');
$uberX->printDataCar();

$uberPool = new UberPool('ZAQ3455', new Account('Laura Hernandez', '4830K'), 'Porche', 'Chayan');
$uberPool->printDataCar();

?>