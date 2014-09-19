package internal

/**
 * Modified by Jean Sung
 * LoopUntil:
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {

	// re-defintion of loop_until method
	def loop_until(breakCondition: => Boolean)(body: => Unit) = {
		while (!breakCondition) {body}
	}
	// verifying use case
	var i = 0
			loop_until (i > 9) {
		if ( (i % 2) == 0 )
			println(i)
			i += 1
	}
}
