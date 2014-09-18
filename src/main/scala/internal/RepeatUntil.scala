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
  
  // define the new control-flow structure here
  
  class repeater(body: =>Unit) {
    def until(control: =>Boolean) = {
      do body while (!control)
    }
  }
  
  def repeat(body: =>Unit) = {
    new repeater(body)
  }
  
  
  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

