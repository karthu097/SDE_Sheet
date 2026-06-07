package TakeUForward;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PascalsTriangle {
    public static void main(String[] args) {
//step 1 : -
        int[] row = new int[1];// constructing an array
        row[0] = 1; //declaring the array of index 0 is 1
//step 2 : -
        // we are buut the pascal tringle of 5 rows
        for( int i =0;i<5;i++){
            //step 3 printing the current row
            for(int j = 0;j<=row.length-1;j++){
                System.out.print(row[j] + " ");
            } // this prints the current row
            System.out.println();

            //step 4 :building the next row
            // next row always has one more element than current
            int[] next = new int[row.length + 1];

            //step 5 : first and last should be 1
            next[0] =1;
            next[next.length -1] = 1; // making sure that first and the lat element is 1

            //step 6 : middle elementss = sum of the above elements
            //your ans : j-1 , j
            for( int j=1;j<next.length -1;j++){
                next[j] = row[j-1] + row[j];
                /*
                Example current row = [1 ,2 , 1]
                j=1 : next [1] = row [0] + row[1] = 1+2 =3
                j=2 : next [2] = row [1] + row[2] = 2+1 =3
                so  the next row will bw [1 , 3, 3, 1]
                 */
            }
            row = next;
        }
    }
}