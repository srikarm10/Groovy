enum Priority{
    LOW, MEDIUM, HIGH, URGENT
}
class Ticket {
    def priority
    def title
}

def helpdeskQueue = [
        new Ticket(priority: Priority.HIGH, title: 'My laptop is on fire'),
        new Ticket(priority: Priority.LOW, title: 'Where is any key'),
        new Ticket(priority: Priority.URGENT, title: 'I am the CEO and need quick help'),
        new Ticket(priority: Priority.MEDIUM, title: 'I forgot my password')
]

def focus = Priority.HIGH..Priority.URGENT

for(ticket in helpdeskQueue){
    if(ticket.priority in focus){
        println "You need to see to : ${ticket.title}"
    }
}