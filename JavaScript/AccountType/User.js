import Account from "../Account.js";

class User extends Account{
    constructor(name, document, email, verified){
        super(name, document, email, verified)
    }
}

export default User