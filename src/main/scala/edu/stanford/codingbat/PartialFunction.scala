class PartialFunction {
  
  // use a partial function to add "o" to the end of strings and 
  // add 1 to integers and add 10 to floats
  //List(1,2,3,"foo")-> List(2,3,4,"fooo")
  //List(1,2,3,24.5,"test")=>List(2,3,4,34.5,"testo")
  def eliminateFoo(list:List[Any]):List[Any]={
    list.collect{
      case i: Int=>i+1
      case f: Float =>f+10
      case s: String =>s+"o"
    }
  }
  
  //you can compose a new function from a set of existing functions 
  //similar to object composition in Java
  //to apply a function you have to call map. We can define the order
  //of application of a function using the scala partial function method
  //andThen on lists. Create a set of partial functions, 
  //add 1 to a number, square the number, divide by 2, use 
  //andthen to apply the 3 functions in sequence. Alternatively you can
  //call map 3 times. 
  def testAndThen(num:Int):Int={
    num andThen addOne andThen square andThen divideBy2
  } 
  
  def addOne(num:Int):Int={
    num+1
  }
  def square(num:Int):Int={
    num*num
  }
  def divideBy2(num:Int):Int={
    num/2
  }
  
  //repeat the above but use reduce to create a new function called 
  //asdf which performs the 3 ops in sequence
  
  def asdf(num:Int):Int= addOne reduce square andThen divideBy2
  
  
  
}