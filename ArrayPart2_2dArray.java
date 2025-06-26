// array dimentions
// 2D array................here we define the 2 dimentions to declair the raw and column
class arr2D {
    public static void main(String[] args) {
        int [][] myArr = new int[2][3];
        myArr[0][0] = 9;
        System.out.println(myArr.length);
    }
}


class twoDimArray {

    public static void main(String[] args) {
        // homoginius because all the raw and the columns are having the same dimensions.
        int [][] arr = {{2,3,4,5}, {3,4,5,2}, {2,6,7,9}};
        



        // traversal
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}