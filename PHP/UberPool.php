<?php
require_once('Car/BasicCar.php');
class UberPool extends BasicCar {
    public function __construct ($license, $driver, $brand, $model) {
        parent::__construct($license, $driver, $brand, $model);
    } 
}

?>