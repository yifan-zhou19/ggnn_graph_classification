package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[5][5];
	 int max;
	 int h;
	 int l;
	 int sum;
	 int s = 0;
	 int i;
	 int j;
	 int k;

	 for (i = 0;i < 5;i++)
	 {
		 for (j = 0;j < 5;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar);
			 }
		 }
	 }

	 for (i = 0;i < 5;i++)
	 {

		 sum = 0;
		 max = a[i][0];
		 h = i;
		 l = 0;
		 for (j = 0;j < 5;j++)
		 {
			 if (max < a[h][j])
			 {
				 max = a[h][j];
				 l = j;
			 }
		 }

		 for (k = 0;k < 5;k++)
		 {
			  if (max <= a[k][l])
			  {
				   sum++;
			  }
		 }

		 if (sum == 5)
		 {
					 System.out.printf("%d %d %d",h + 1,l + 1,a[h][l]);
					 return 0;
		 }
	 }

	 System.out.print("not found");
	 return 0;
	}

}

