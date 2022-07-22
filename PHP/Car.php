<?php
require_once 'Account.php';
class Car {
    public $id;
    public $license;
    public $driver;
    public $passagers;

    public function _construct (string $license, Account $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCard(){
        echo '<p>Car License: ' . $this->license . '</p>';
        echo '<p>Driver: </p>';
    }
}
?>