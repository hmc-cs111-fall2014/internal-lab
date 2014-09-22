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
  
  def repeat(body: ⇒Unit) = {
    new UntilRunner(body)
  }
  
  class UntilRunner(body: ⇒Unit) {
    def until(condition: ⇒Boolean) = {
      body                 // the body executes at least once 
      while (!condition)
        body
    }
  }
  
  /**
   * The solution to this puzzle is so common, that Scala added some syntactic
   * sugar to make it easier. Rather than define a function that returns an 
   * instance of a class that has the method we want, we can declare an implicit
   * class, whose constructor serves the role of the function! To try it, 
   * uncomment the code below (and comment out the code above).
   */
  
  /*
    implicit class repeat(body: ⇒Unit) {
      def until(condition: ⇒Boolean) = {
        body                 // the body executes at least once 
        while (!condition)
          body
      }
    }    
  */
  
  var i = 0
  
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)
  
}

