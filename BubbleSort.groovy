class BubbleSort {    
    static def sort(List input) {
        if(!input || input.size < 2) {
            throw new IllegalArgumentException('Invalid input !!!');
        } else {
            def init = System.currentTimeMillis()
            bubbleSort(input)
            println "BubbleSort Execution Time ${System.currentTimeMillis() - init}ms"
            return input
        }
    }

    private static def bubbleSort(List input) {        
        def changed = true        
        while(changed) {
            changed = false
            for(int i = 0; i < input.size - 1 ; i++) {
                if(input[i] > input[i + 1]){
                    def aux = input[i]
                    input[i] = input[i + 1]
                    input[i + 1] = aux
                    changed = true
                }
            }    
        }
    }
}