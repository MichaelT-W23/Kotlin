def binarySearch(lst, target):
    found = False 
    first = 0
    last = len(lst) - 1

    while first <= last and not found:
        mid = (first + last) // 2

        if target < lst[mid]:
            last = mid - 1
        elif target > lst[mid]:
            first = mid + 1
        else:
            return True 
        
    return False