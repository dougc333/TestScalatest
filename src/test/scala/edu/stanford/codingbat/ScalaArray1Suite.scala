
import java.io.{FileWriter,File,PrintWriter}
import org.scalatest.FunSuite
import edu.stanford.codingbat.ScalaRecursion1



class ScalaArray1Suite {
  val t = new ScalaArray1()
  
//firstLast6({1, 2, 6}) → true
//firstLast6({6, 1, 2, 3}) → true
//firstLast6({13, 6, 1, 2, 3}) → false
  //Scala array supports both length and size, is this true for all scala collection classes? Yes. Is there a correct style answer? 
def test("testing firstLast6") ={
  assert(t.firstLast6(new Array(1, 2, 6)) == true)
  assert(firstLast6(new Array(6, 1, 2, 3)) == true)
  assert(firstLast6( new Array(13, 6, 1, 2, 3)) == false)
}
	


//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. 

//sameFirstLast({1, 2, 3}) → false
//sameFirstLast({1, 2, 3, 1}) → true
//sameFirstLast({1, 2, 1}) → true
// seems like a dumb idiom array(size-1) for the index to get the last element or conversely a(0) to get the first element instead of a(1)
def test("testing sameFirstLast")= {
  assert(t.sameFirstLast(new Array(1, 2, 3)) == false)
  assert(t.sameFirstLast(new Array(1, 2, 3, 1)) == true)
  assert(t.sameFirstLast(new Array(1, 2, 1)) == true)
}



//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}. 
//makePi() → {3, 1, 4}
def test("testing makePi")= {
  assert(t.makePi() == new Array(3, 1, 4))
}


//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
//Both arrays will be length 1 or more. 

//commonEnd({1, 2, 3}, {7, 3}) → true
//commonEnd({1, 2, 3}, {7, 3, 2}) → false
//commonEnd({1, 2, 3}, {1, 3}) → true
def test("testing commonEnd")= {
  assert(t.commonEnd(new Array(1, 2, 3), new Array(7, 3)) → true)
  assert(t.commonEnd(new Array(1, 2, 3), new Array(7, 3, 2)) → false)
  assert(t.commonEnd(new Array(1, 2, 3), new Array(1, 3)) → true)
}


//Given an array of ints length 3, return the sum of all the elements. 

//sum3({1, 2, 3}) → 6
//sum3({5, 11, 2}) → 18
//sum3({7, 0, 0}) → 7

def test("testing sum3")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//note to self: generalize this  problem to rotate n 
//rotateLeft3({1, 2, 3}) → {2, 3, 1}
//rotateLeft3({5, 11, 9}) → {11, 9, 5}
//rotateLeft3({7, 0, 0}) → {0, 0, 7}
def test("testing rotateLeft3")= {
  assert(t.)
  assert(t.)
  assert(t.)
}

//should be doable w/foldleft also
//recursion using accumulator as empty array start at index and keep on accumulating till empty
//this is dumb...from http://aperiodic.net/phil/scala/s-99/p19.scala
def test("testing rotate") = {
  assert(t.)
  assert(t.)
  assert(t.)
  
}

//first do no return, do list split and concatenate
//(1,2,3,4,5) rotate left 1: 2,3,4,5,1
//(1,2,3,4,5) rotate left 2: 3,4,5,1,2
//(1,2,3,4,5) rotate left 3: 4,5,1,2,3
def test("testing rotateList") =  {
  assert(t.)
  assert(t.)
  assert(t.)
}

//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}. 

//reverse3({1, 2, 3}) → {3, 2, 1}
//reverse3({5, 11, 9}) → {9, 11, 5}
//reverse3({7, 0, 0}) → {0, 0, 7}
def test("testing reverse3")= {
  assert(t.)
}


//Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array. 

//maxEnd3({1, 2, 3}) → {3, 3, 3}
//maxEnd3({11, 5, 9}) → {11, 11, 11}
//maxEnd3({2, 11, 3}) → {3, 3, 3
def test("testing maxEnd3")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given an array of ints, return the sum of the first 2 elements in the array. 
//If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0. 

//sum2({1, 2, 3}) → 3
//sum2({1, 1}) → 2
//sum2({1, 1, 1, 1}) → 2
def test("testing sum2")= {
  assert(t.)
  assert(t.)
  assert(t.)
}
//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. 

//middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}
//middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}
//middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}
def test("testing middleWay")= {
  assert(t.)
  assert(t.)
  assert(t.)
}





//Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
//The original array will be length 1 or more. 

//makeEnds({1, 2, 3}) → {1, 3}
//makeEnds({1, 2, 3, 4}) → {1, 4}
//makeEnds({7, 4, 6, 2}) → {7, 2}
def test("testing makeEnds")= {
  assert(t.)
  assert(t.)
  assert(t.)
}



//Given an int array length 2, return true if it contains a 2 or a 3. 

//has23({2, 5}) → true
//has23({4, 3}) → true
//has23({4, 5}) → false
def test("testing has23")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given an int array length 2, return true if it does not contain a 2 or 3. 

//no23({4, 5}) → true
//no23({4, 2}) → false
//no23({3, 5}) → false
def test("testing no23")= {
  assert(t.)
  assert(t.)
  assert(t.)
  
}


//Given an int array, return a new array with double the length where its last element is the same as the original array, 
//and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's. 

//makeLast({4, 5, 6}) → {0, 0, 0, 0, 0, 6}
//makeLast({1, 2}) → {0, 0, 0, 2}
//makeLast({3}) → {0, 3}
def test("testing makeLast")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2. 

//double23({2, 2}) → true
//double23({3, 3}) → true
//double23({2, 3}) → false
def test("testing double23")= {
  assert(t.)
  assert(t.)
  assert(t.)
  
}


//note to self. what does reduce right do?
//scala> val a=Array(1,2,3,4,5,6)
//a: Array[Int] = Array(1, 2, 3, 4, 5, 6)

//scala> a.reduceRight((elem,result)=> {println("elem:"+elem+" result:"+result);100})
//elem:5 result:6
//elem:4 result:100
//elem:3 result:100
//elem:2 result:100
//elem:1 result:100
//res58: Int = 100

//we can use the above to look at pairs of elements in the array by replacing the 100 with elem

//scala> a.reduceRight((elem,result)=> {println("elem:"+elem+" result:"+result);elem})
//elem:5 result:6
//elem:4 result:5
//elem:3 result:4
//elem:2 result:3
//elem:1 result:2
//res60: Int = 1


//Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array. 

//fix23({1, 2, 3}) → {1, 2, 0}
//fix23({2, 3, 5}) → {2, 0, 5}
//fix23({1, 2, 1}) → {1, 2, 1}
//can use binary ops to do this?  
def test("testing fix23")= {
  assert(t.)
  assert(t.)
  assert(t.)
}





//Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element. 

//start1({1, 2, 3}, {1, 3}) → 2
//start1({7, 2, 3}, {1}) → 1
//start1({1, 2}, {}) → 1
def test("testing start1")= {
  assert(t.)
  assert(t.)
  assert(t.)
}



//Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a. 

//biggerTwo({1, 2}, {3, 4}) → {3, 4}
//biggerTwo({3, 4}, {1, 2}) → {3, 4}
//biggerTwo({1, 1}, {1, 2}) → {1, 2}
def test("testing biggerTwo")= {
  assert(t.)
  assert(t.)
  assert(t.)
}



//Given an array of ints of even length, return a new array length 2 containing the middle two elements 
//from the original array. The original array will be length 2 or more. 

//makeMiddle({1, 2, 3, 4}) → {2, 3}
//makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
//makeMiddle({1, 2}) → {1, 2}
def test("testing makeMiddle")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. 

//plusTwo({1, 2}, {3, 4}) → {1, 2, 3, 4}
//plusTwo({4, 4}, {2, 2}) → {4, 4, 2, 2}
//plusTwo({9, 2}, {3, 4}) → {9, 2, 3, 4}
def test(" testing plusTwo")= {
 assert(t.)
 assert(t.)
 assert(t.)
}



//Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1. 

//swapEnds({1, 2, 3, 4}) → {4, 2, 3, 1}
//swapEnds({1, 2, 3}) → {3, 2, 1}
//swapEnds({8, 6, 7, 9, 5}) → {5, 6, 7, 9, 8}
def test("testing swapEnds")= {
  //val tmp = nums(0) note to self, we dont need a tmp cause of the drop/take api
   assert(t.)
   assert(t.)
   assert(t.)
}


//Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3. 

//midThree({1, 2, 3, 4, 5}) → {2, 3, 4}
//midThree({8, 6, 7, 5, 3, 0, 9}) → {7, 5, 3}
//midThree({1, 2, 3}) → {1, 2, 3}
//NOTE TO SELF, GENERALIZE FOR N COPIES
def test("testing midThree")= {
  assert(t.)
  assert(t.)
  assert(t.)
}



//Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
//The array length will be a least 1. 

//maxTriple({1, 2, 3}) → 3
//maxTriple({1, 5, 3}) → 5
//maxTriple({5, 2, 3}) → 5
def test("testing maxTriple")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present. 

//frontPiece({1, 2, 3}) → {1, 2}
//frontPiece({1, 2}) → {1, 2}
//frontPiece({1}) → {1}
def test("testing frontPiece")= {
  assert(t.)
  assert(t.)
  assert(t.)
}


//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 

//unlucky1({1, 3, 4, 5}) → true
//unlucky1({2, 1, 3, 4, 5}) → true
//unlucky1({1, 1, 1}) → false
def test("testing unlucky1")= {
  assert(t.)
  assert(t.)
  assert(t.)
}

//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
//the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. 

//make2({4, 5}, {1, 2, 3}) → {4, 5}
//make2({4}, {1, 2, 3}) → {4, 1}
//make2({}, {1, 2}) → {1, 2}
def test("testing make2")= {
  assert(t.)
  assert(t.)
  assert(t.)
}



//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
//If either array is length 0, ignore that array. 

//front11({1, 2, 3}, {7, 9, 8}) → {1, 7}
//front11({1}, {2}) → {1, 2}
//front11({1, 7}, {}) → {1}
def test("testing front11")= {
  assert(t.)
  assert(t.)
  assert(t.)
}

}