import myHashTable.MyHashTable

fun main() {
    val myHashTable = MyHashTable()

    myHashTable.set("grapes", 1000)
    println(myHashTable.generateHash("abcd"))
}