package myHashTable

class MyHashTable() {
    private val data = mutableMapOf<String,Int>()

    fun generateHash(key: String): Int {
        var hash=0
        for(i in key) {
            hash += i.toInt()
        }
        return hash
    }

    fun set(key: String, value: Int) {
        data[key] = value
    }
}