<?php
require_once('Payment.php');

class Cash extends Payment{
    public $email;

    public function __construct (int $id, string $email){
        parent::__construct($id);
        $this->number = $email;
    }
    
}
?>