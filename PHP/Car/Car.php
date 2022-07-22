<?php
require_once('Account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passagers;

    public function __construct ($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo '<p>Car License: ' . $this->license . '</p>';
        echo '<p>Driver: '. $this->driver->name .' </p>';
        echo '<p>Driver Document: '. $this->driver->document .' </p>';
    }
}
?>