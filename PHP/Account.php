<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;
    public $verified;

    public function __construct ($name, $document, $email, $verified) {
        $this->name = $name;
        $this->document = $document;
        $this->email = $email;
        $this->verified = $verified;
    }

    public function printDataUser(){
        echo '<p>Name: ' . $this->name . '</p>';
        echo '<p>Document: '. $this->document .' </p>';
        if ($this->verified) {
            echo '<p>Email: '. $this->email .' </p>';
        }
    }
}
?>