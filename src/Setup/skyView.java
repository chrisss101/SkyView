package Setup;

public class skyView {
    private double[][] view;
    private int numRows;
    private int numCols;
    public skyView(int numRows,int numCols,double[] scanned) {
        this.numRows = numRows;
        this.numCols = numCols;
        view = new double[numRows][numCols];
        int k = 0;
        for (int i = 0; i <numRows;i++) {
            if ((numRows % 2) ==0) {
                k =(numRows*i);
                for (int j = 0;j < numCols; j++) {
                    view[i][j] = scanned[k];
                    k++;
                }
            }
            else {
                k = numCols + (numRows*i);
                for (int j = numCols;j > 0; j--) {
                    view[i][j] = scanned[k];
                    k--;
                }
            }
        }
    }
    public double getAverage(int startRow,int endRow,int startCol, int endCol) {
        double average = 0;
        for (int m = startRow;m < endRow;m++) {
            for (int n = startCol;n < endCol;n++) {
                average += view[m][n];
            }

        }
        average = average/((endRow - startRow)*(endCol - startCol));
        return average;
    }
}
