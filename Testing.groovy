

List numbersQuickFirstSelect = new ArrayList()
List numbersQuickRamdomSelect = new ArrayList()
List numbersBubble = new ArrayList()


def inputSize = 100

println "input size of $inputSize"

for(int i = 0; i < inputSize; i++) {
    Integer number = Math.floor(Math.random() * inputSize)
    numbersQuickFirstSelect.add(number)
    numbersQuickRamdomSelect.add(number)
    numbersBubble.add(number)
}

BubbleSort.sort(numbersBubble)
QuickSortFirstSelection.sort(numbersQuickFirstSelect)
QuickSortRamdomSelection.sort(numbersQuickRamdomSelect)
