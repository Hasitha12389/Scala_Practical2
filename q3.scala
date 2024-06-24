object q3{

def total_normal(work_hour: Float): Float={
  work_hour*250;
}

def total_OT(OT_hours:Float): Float={
    OT_hours*85;
}


def total_salary(work_hour: Float,OT_hours: Float): Float={
 var normal = total_normal(work_hour);
 var OT = total_OT(OT_hours); 
 ((normal + OT)*88)/100
}

def main(args: Array[String]): Unit={
 //println("Enter the Normal working hours = ");
 var work_hour = 40 //scala.io.StdIn.readLine();
 // println("Enter OT hours = ");
 var OT_hours = 30 //scala.io.StdIn.readLine();

 var last_salary = total_salary(work_hour,OT_hours);
 println(last_salary)
    }
}