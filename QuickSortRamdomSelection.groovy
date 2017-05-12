class QuickSortRamdomSelection {

    static def sort(List input) {
        if(!input) {
            throw new IllegalArgumentException('Invalid input !!!');
        } else {
            def init = System.currentTimeMillis()
            def begin = 0
            def end = input.size - 1
            quickSort(input, begin, end)
            println "QuickSortRamdomSelection Execution Time ${System.currentTimeMillis() - init}ms"
            return input
        }
    }
    
    static private def quickSort(List input, begin, end) {
        if(begin < end) {
            def pivo = partition(input, begin, end)
            quickSort(input, begin, pivo - 1)
            quickSort(input, pivo + 1, end)    
        }
    }
    
    static private def partition(List input, begin, end) {
        
        Integer number = Math.floor(Math.random() * input.size) % input.size

        def pivo = input[number]
        def i = begin
        
        for(def j = begin; j <= end - 1; j++) {
            if(input[j] < pivo) {
                def aux = input[i]
                input[i] = input[j]
                input[j] = aux
                i++            
            }
        }
      
        def aux = input[i]
        input[i] = input[end]
        input[end] = aux
        return i   
    }
}