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
 println("Work hours = 40 OT hours = 30 , " + total_salary(40.0,30.0));
  }
}
