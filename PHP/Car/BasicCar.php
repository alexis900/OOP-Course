<?php
require_once('Car.php');
class BasicCar extends Car {
    public $brand;
    public $model;

    public function __construct ($license, $driver, $brand, $model) {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    } 
}
?>