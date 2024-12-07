public class Main {
    public static void main(String[] args) {
        int[] array = {3,23,4,2,35,23,35,2,1,3};
        int target = 3;
        int result = LinearSearch.linearSearch(array,target);
        System.out.println(result==-1 ? " элемент не найден":" элемент найден на индексе "+result);

    }
}