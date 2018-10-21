package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[8][8];
	 int i;
	 int j;
	 int t;
	 int k;
	 int max;
	 int min;
	 int l = 0;
	 int N;
	 int M;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 M = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < N;i++)
	 {
		 for (j = 0;j < M;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	 for (i = 0;i < N;i++)
	 {
		 max = a[i][0];
		 k = 0;
		 for (j = 1;j < M;j++)
		 {
			 if (a[i][j] > max)
			 {
				 max = a[i][j];
				 k = j;
			 }
		 }
		 min = a[0][k];
		 for (t = 1;t < N;t++)
		 {
			 if (a[t][k] < min)
			 {
				 min = a[t][k];
			 }
		 }
		 if (max == min)
		 {
			 System.out.printf("%d+%d",i,k);
			 l++;
		 }
	 }
	 if (l == 0)
	 {
		 System.out.print("No\n");
	 }
	 return 0;
	}
}

