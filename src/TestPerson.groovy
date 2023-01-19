class Person {
    def name
    def email
    def getName(){
        return this.name
    }
    def setName(name){
        this.name = name
    }
    def getEmail(){
        return this.email
    }
    def setEmail(email){
        this.email = email
    }
}

def sri = new Person(name: 'Srikar', email: 'srikar@example.com')
sri.setEmail('sri@example.com')
println sri.getName()
println sri.getEmail()
println sri.class.name
println sri.dump()
println "This is using with"
sri.with{
    println name
    println email
}

def str = 'This is first time using "Groovy"'
println str.toUpperCase()
println str.toLowerCase()
println str.reverse()
println str.size()
println str.split()
println 3.14.class.name

def truth = true
def lies = false
assert truth.and(lies) == false
println 0b1010 //binary
println 0xf //Hexa decimal
println 017 //Octal

