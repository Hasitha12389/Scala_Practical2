object q2{

def main(args: Array[String]): Unit = {
 var a = 2;
 var b = 3;
 var c = 4;
 var d = 5;
 var k = 4.3;

 //a)
 b -= 1;          // In Scala there is no increment and decrement operators. That is why i use that
 print(" - -b * a + c *d - - = ");
 println(((b)*a)+(c*(d))) ;
 d -= 1 ;
 

 //b)
 a += 1;
 print(" ++a = ");
 println(a);


 //c)
 //  print("-2 * (g - k) +c = ");           NO G VALUE
 // println((-2 * (g - k)) +c);

 //d)
 print("c=c++ = ");
 println(c);
  c += 1;

 //e)
 c += 1;
 print("c=++c*a++ = ");
 println(a*c);
 a += 1;
 
 }
}
