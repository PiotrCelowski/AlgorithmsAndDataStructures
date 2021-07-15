import LinkedList.LinkedList
import LinkedList.Node

fun main() {
    val unsortedList = arrayListOf<Int>(5,224,1,48,33333,2)
    val sorter = Sorter()
    val sortedList = sorter.insertionSort(unsortedList)
    println(sortedList)
}