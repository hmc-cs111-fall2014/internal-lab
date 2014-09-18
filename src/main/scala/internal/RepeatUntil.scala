package internal

/**
 * Modified by Jean Sung
 * help from Prof Ben in office hours
 * RepeatUntil:
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object RepeatUntil extends App {
  
  implicit class repeat(body: => Unit) {
    def until(cond: => Boolean):Unit = {
      do {
        body
      } while (!cond)
    }
  }
  
  /*
    Equivaliently is to have 
    
    class RepeatWrapper(body: => Unit) {
    	def until(cond: => Boolean):Unit = {
	      do {
	        body
	      } while (!cond)
    }
  }
    
    def repeat(body: => Unit) = {
    	new RepeatWrapper(body)
  	}
  */
  var i = 0
   repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)   
  
  
}


