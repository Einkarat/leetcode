public static void main(String[]args){
		int [][] arr=new int[][]{{4,5,6},{2,3,9}};
		int [][]arrtrans=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
        	for(int j=0;j<arr[0].length;j++){
        		arrtrans[j][i]=arr[i][j];
        	}
        }
        for(int i=0;i<arrtrans.length;i++){
        	for(int j=0;j<arrtrans[0].length;j++){
        		System.out.print(arrtrans[i][j]);		
        	}
        	System.out.println();
        }
	}

/*public static void main(String[]args){
              int [][] arr=new int[][]{{4,5,6},{2,3,9}};
              int [][] arrtrans=new int[arr[0].length][arr.length];
        for (int i=0;i<arr.length;i++){
                for (int j=0; j<arr[0].length;j++){
                        arrtrans[j][i]=arr[i][j];
                }
        }

        for (int i=0;i<arr.length;i++){
                for (int j=0; j<arr[0].length;j++){
                        System.out.print(arrtrans[i][j]);
                }
                System.out.println();
        }



}*/


