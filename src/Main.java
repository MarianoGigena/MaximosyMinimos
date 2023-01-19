public class Main {
    public static void main(String[] args) {

        int[] lsta=new int[] {1,2,3,4,5,6};
        System.out.println(min(lsta));
        System.out.println(max(lsta));
    }
    public static int min(int[] list) {
        int minimo=list[0];

        for(int i=0;i<list.length;i++){

            if (minimo > list[i]){
                minimo=list[i];
            }
        }

        return minimo;
    }

    public static int max(int[] list) {
        int maximo=list[0];

        for(int i=0;i<list.length;i++){

            if (maximo < list[i]){
                maximo=list[i];
            }
        }

        return maximo;
    }
}