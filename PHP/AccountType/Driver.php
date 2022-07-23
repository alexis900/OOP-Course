<?php
require_once('Account.php');
class Driver extends Account{
    public function __construct($name, $document, $email, $verified){
        parent::__construct($name, $document, $email, $verified);
    }
}

?>