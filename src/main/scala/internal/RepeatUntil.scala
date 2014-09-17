package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object RepeatUntil extends App {
	 def repeat (body: => Unit) {
		body 
		while (!until _) {body}
	    def until(condition: Boolean) = if (condition) true else false
	   
	 }
	
	 
	//  make the until similar to a function to mimic the function call 
	  // define the new control-flow structure here

	  	
	  
//      def repeat (body: => Unit)(breakCondition: => Boolean) = {
//        body
//
//    while (!breakCondition) {
//      body
//    }
 // }
      
      //def until(condition: Boolean) = if (condition) true else false 
      //val until = until2 _
      
    //val until = (condition: Boolean) => if (condition) true else false 
      

  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)    
  
  
}

