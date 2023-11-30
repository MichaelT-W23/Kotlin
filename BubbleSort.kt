//kotlinc -include-runtime -d bin/BubbleSort.jar BubbleSort.kt
//java -jar bin/BubbleSort.jar

fun bubbleSort(array: IntArray): IntArray {
    val n = array.size

    for (i in 0 until n - 1) //Iterates in reverse order 
    { 
        for (j in 0 until n - i - 1) //Iterates in order 
        {  
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    
    return array
}

fun main() {
    /**
     * THIS IS THE DRIVER CODE. DON'T EDIT
     */
    val unorderedList = intArrayOf(24, 12, 5, 80, 81, 67, 11, 92, 2, 10, 101, 93)

    println("Unordered: ${unorderedList.joinToString(", ")}")

    val orderedList = bubbleSort(unorderedList)

    println("Ordered: ${orderedList.joinToString(", ")}")
}
