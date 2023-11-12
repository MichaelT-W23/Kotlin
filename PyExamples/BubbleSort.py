def bubble_sort(array):
    for i in range(len(array) - 1, 0, -1):
        for j in range(i):
            if array[j] > array[j + 1]:
                temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp

    return array

unorderedList = [24, 12, 5, 80, 81, 67, 11, 92, 2, 10, 101, 93]

print(f"Unordered: {unorderedList}")

orderedList = bubble_sort(unorderedList)

print(f"Ordered: {orderedList}")