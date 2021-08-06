package myArray

class MyArray<T>{
    var length = 0;
    var data = mutableMapOf<Int,T>()

    fun fetchElement(index: Int): T? {
        return data[index]
    }

    fun push(item: T): Int {
        data[length] = item
        length++
        return length
    }

    fun pop(): T? {
        val elementToRemove = fetchElement(length-1)
        data.remove(length-1)
        return elementToRemove
    }

    fun delete(index: Int) {
        data.remove(index)
        shiftItems(index)
    }

    private fun shiftItems(index: Int) {
        for(i in index until length-1) {
            val nextItem = data[i+1]
            data[i] = nextItem!!
        }
        length--
    }


}