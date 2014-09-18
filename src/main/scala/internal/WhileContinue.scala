package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object WhileContinue extends App {

  // define the new control-flow structures here
  case class continueException(str:String) extends Exception(str)
  
  def while_c(control: =>Boolean)(body: =>Unit) = {
    while (control) {
      try {
        body
      } catch {
        case e: continueException => Nil
      }
    }
  }
  
  def continue = {
    throw new continueException("")
  }
  
  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
