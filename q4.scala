object q4{

def attendees(price:Int):Int={
 120+(15-price)/5*20;
}

def revenue(price:Int):Int ={
 attendees(price)* price;
}

def cost(price:Int):Int={
 500+attendees(price);
}

def profit(price:Int):Int ={
 revenue(price)- cost(price)
}

def main(args: Array[String]): Unit={
 println("Ticket price Rs. 5 = "+profit(5))
 println("Ticket price Rs. 10 = "+ profit(10))
 println("Ticket price Rs. 15 = "+ profit(15))
 println("Ticket price Rs. 20 = "+ profit(20))
 println("Ticket price Rs. 25 = "+ profit(25))
 println("Ticket price Rs. 30 = "+ profit(30))
 }
}
