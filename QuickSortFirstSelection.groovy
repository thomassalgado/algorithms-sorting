class QuickSortFirstSelection {

    static def sort(List input) {
        if(!input) {
            throw new IllegalArgumentException('Invalid input !!!');
        } else {
            def init = System.currentTimeMillis()
            def begin = 0
            def end = input.size - 1
            quickSort(input, begin, end)
            println "QuickSortFirstSelection Execution Time ${System.currentTimeMillis() - init}ms"
            return input
        }
    }
    
    static private def quickSort(List input, begin, end) {
        int pivot = partition(input, begin, end);
        if (begin < pivot - 1){
            quickSort(input, begin, pivot - 1);
        }
        if (pivot < end){
            quickSort(input, pivot, end);
        }
    }
    
    static private def partition(List input, begin, end) {
        def i = begin
        def j = end
        int pivot = input[begin];
        while (i <= j) {
            while (input[i] < pivot)
                  i++;
            while (input[j] > pivot)
                  j--;
            if (i <= j) {
                  def aux = input[i]
                  input[i] = input[j]
                  input[j] = aux
                  i++
                  j--
            }
        }
      return i
    }
}