class Account{
    constructor(name, document, email, verified){
        this.id
        this.name = name
        this.document = document
        this.email = email
        this.password = this.password
        this.verified = verified
    }

    printDataAccount = () => {
        console.log(`Name: ${this.name} Document: ${this.document} Email: ${this.email} Verified: ${this.verified}`)
    }
}

export default Account