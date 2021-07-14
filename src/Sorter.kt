class Sorter {
    fun bubbleSortNormal(array: ArrayList<Int>): ArrayList<Int> {
        val arraySize = array.size
        var arrayNotSorted = true

        while (arrayNotSorted) {
            arrayNotSorted = false

            for (i in 1 until arraySize) {
                val firstElement = array[i]
                val secondElement = array[i + 1]

                if (secondElement < firstElement) {
                    array[i] = secondElement
                    array[i + 1] = firstElement

                    arrayNotSorted = true
                }
            }
        }

        return array
    }

    fun bubbleSortRecursive(arrayInput: ArrayList<Int>, lengthOfCurrentArray: Int): ArrayList<Int> {
        val arraySize = arrayInput.size

        if (lengthOfCurrentArray == 1) {
            return arrayInput
        }

        for (i in 0 until lengthOfCurrentArray) {
            val firstElement = arrayInput[i]
            val secondElement = arrayInput[i + 1]

            if (secondElement < firstElement) {
                arrayInput[i] = secondElement
                arrayInput[i + 1] = firstElement
            }
        }

        bubbleSortRecursive(arrayInput, lengthOfCurrentArray - 1)

        return arrayInput
    }

    fun selectionSort(arrayInput: ArrayList<Int>): ArrayList<Int> {
        val newArray = arrayListOf<Int>()

        while (arrayInput.size > 0) {
            val minValue = arrayInput.min()
            val indexOfMinValue = arrayInput.indexOf(minValue)
            newArray.add(minValue!!)
            arrayInput.removeAt(indexOfMinValue)
        }

        return newArray
    }

    fun quickSort(arrayInput: ArrayList<Int>): List<Int> {
        val leftArray = arrayListOf<Int>()
        val rightArray = arrayListOf<Int>()
        val equals = arrayListOf<Int>()

        if (arrayInput.size < 2) {
            return arrayInput
        } else {
            val pivot = arrayInput[arrayInput.size/2]

            for (i in 0 until arrayInput.size) {
                val element = arrayInput[i]

                if (element == pivot) {
                    equals.add(element)
                } else if (element < pivot) {
                    leftArray.add(element)
                } else {
                    rightArray.add(element)
                }
            }

        }
        return quickSort(leftArray) + equals + quickSort(rightArray)
    }

    private fun isSorted(inputArray: ArrayList<Int>): Boolean {
        for (index in 0 until inputArray.size - 1) {
            if (inputArray[index] > inputArray[index + 1]) {
                return false
            }
        }
        return true
    }

}