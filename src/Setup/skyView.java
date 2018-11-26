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
                for (int j = 0;j < numCols; j++) {
                    view[i][j] = scanned[k];
                }
            }
            else {
                for (int j = numCols;j > 0; j--) {
                    view[i][j] = scanned[k];
                }
            }
        }
    }
}
