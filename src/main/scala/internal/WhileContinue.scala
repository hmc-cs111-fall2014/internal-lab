package internal

/**Modified by Jean Sung
 * got help from Prof Ben during office hours (for continue as an exception)
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object WhileContinue extends App {

	// re definition of while continue
	def while_c(keepGoing: => Boolean)(body: => Unit): Unit = {
		try {while(keepGoing) {body}}
		catch {case e: Exception => while_c(keepGoing)(body)}
	}
	
	class continueException extends RuntimeException
	def continue = throw new continueException

	// verifying use case
	var i = -1
	while_c (i < 9) {
		i += 1
		if ( (i % 2) != 0 )
			continue 
		println(i)
	}        
}