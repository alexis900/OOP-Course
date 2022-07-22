<?php
require_once('AdvancedCar.php')
class UberBlack extends AdvancedCar {
    public function __construct ($license, $driver, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license, $driver, $typeCarAccepted, $seatsMaterial);
    } 
}

?>