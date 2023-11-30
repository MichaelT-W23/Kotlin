
//kotlinc -include-runtime -d bin/BinarySearch.jar BinarySearch.kt
//java -jar bin/BinarySearch.jar

fun binarySearch(lst: List<Int>, target: Int): Boolean {
    var found = false
    var first = 0
    var last = lst.size - 1

    while (first <= last && !found) {
        val mid = (first + last) / 2
        
        //Could of used an if else statment. More language specific 
        when {
            target < lst[mid] -> last = mid - 1
            target > lst[mid] -> first = mid + 1
            else -> return true
        }
    }

    return false
}

fun main() {
    /**
     * THIS IS THE DRIVER CODE. DON'T EDIT
     */
    val numList = listOf(12, 24, 36, 41, 52, 61, 63, 67, 72, 89)

    val validNum = 52
    val result1 = binarySearch(numList, validNum)

    println("$validNum is${ if (result1) "" else " not"} in the list")

    val invalidNum = 27
    val result2 = binarySearch(numList, invalidNum)

    println("$invalidNum is${ if (result2) "" else " not"} in the list")
}
