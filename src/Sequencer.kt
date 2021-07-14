class Sequencer {
    fun calculateFibonacci(number: Int): Int {
        if(number == 0) {
            return 0
        } else if(number == 1) {
            return 1
        }
        return calculateFibonacci(number - 1) + calculateFibonacci(number - 2)
    }
}