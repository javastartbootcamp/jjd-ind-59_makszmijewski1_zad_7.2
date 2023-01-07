package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {

            for (int j = i + 1; j < inputArray.length; j++) {

                int liczbaA = inputArray[i];
                int liczbaB = inputArray[j];
                if (liczbaA > liczbaB) {
                    inputArray[i] = liczbaB;
                    inputArray[j] = liczbaA;
                    counter++;
                } else {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
