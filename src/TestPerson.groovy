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

def mixed = [1, true, "Hello World", 3.14]
println mixed[0..3]
println mixed.get(2)
println mixed[2]
println mixed[-1]
println mixed[1,2]
mixed.add(101)
mixed << 'biscuit'
println mixed

//Set

def names = ['srikar', 'deeksha', 'kriti', 'lavanya'] as Set
println names
println names.head()//first also can be used here
println names.last()
println names.tail() //returns list - head
println names.init() //returns list - tail
println names.contains('nidhi')
println names.sort()
def family = ['srikar', 'deeksha', 'lavanya', 'kriti', 'sreelakshmi', 'ramakrishna'].asImmutable()
println family
//family << 'nidhi'// causes exception as new elements can't be inserted into immutable list

//Map
def periodic = [:]
periodic.put('h', 'hydrogen')
periodic.put('he', 'helium')
periodic.put('li', 'lithium')
println periodic.get('h')
println periodic.li
println periodic['he']

periodic['be'] = 'Beryllium'
periodic.b = 'Boron'
periodic << ['c': 'Carbon']
periodic << [n : 'Nitrogen']

println periodic.keySet()
println periodic.values()
println periodic.containsKey('he')

//Arrays

Number[] point = new Number[2]
point[0] = 27
point[1] = -153
println point
println point.length
println point.size()

Object[] bag = new Object[4]
bag[0] = true
bag[1] = 'Rabbit'
bag[2] = null
bag[3] = 3.14

println bag.sort()
println bag

def list = bag.toList()

list[4]='abc'
println list

def list1 = bag as List
println list1

def countdown = 10..0
println countdown.getFrom()
println countdown.getTo()
println countdown

def floors = 1..10
println floors

def alphabet = 'a'..'z'
println alphabet
