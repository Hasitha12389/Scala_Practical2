object q1{

def question_a(k:Int, m:Int): Int={
    k+(12*m)
    }

def question_b(m:Int, j:Int): Int={
    m/j
    }

def question_c(n:Int, j:Int): Int={
    n%j
    }

def question_d(m:Int, j:Int): Int={
    m/(j*j)
    }

def question_e(f:Float, g:Float): Float={
    f+(10*5)+g
    }

def question_f(i:Int, n:Int): Int={       
  // ++i is not valid in scala
    (i+1)*n
    }

def main(args: Array[String]):Unit={
     
 var k,i,j = 2;    //When we add = for commas it will give an error
 var m,n = 5;
 var f = 12.0f;  //This f represent this nnumber is float/double value
 var g = 4.0f;
 var c = 'X';
 var answer1 = question_a(k,m);
  println(s"k + 12 * m = $answer1");

 var answer2 = question_b(m,j);
  println(s"m / j = $answer2");

 var answer3 = question_c(n,j);
  println(s"n % j = $answer3");

 var answer4 = question_d(m,j);
  println(s"m / j * j = $answer4");

 var answer5 = question_e(f,g);
  println(s"f + 10*5 +g = $answer5");

 var answer6 = question_f(i,n);
  println(s"++i * n = $answer6");
  // If i want to add the value of variable value within this double quatation it must be add the s before start the double quatation
    //When there was a expression it a
}
}