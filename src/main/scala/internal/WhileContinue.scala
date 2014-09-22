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

  // the key idea: implement continue as an exception
  object ContinueException extends RuntimeException
  
  // a parameterless function can be used to add a "keyword" to the language
  // The function results in type Unit, to prevent continue from being used as
  //  an expression (e.g., while_c(continue)).
  def continue: Unit = throw ContinueException
  
  def while_c(condition: ⇒ Boolean)(body: ⇒Unit): Unit = {
    try {
      while(condition)
        body
    } catch {
      case ContinueException ⇒ while_c(condition){body}
    }
  }
  
  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  } 
}
