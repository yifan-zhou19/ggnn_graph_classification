package <missing>;

public class GlobalMembers
{
	public static int y(int n,int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
	 int[][] a = new int[5][5];
	 int i;
	 int j;
	 int t;
	 int m;
	 int n;
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
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 if (y(n, m) == 0)
	 {
		 System.out.print("error");
		 return 0;
	 }
	 if (y(n, m) == 1)
	 {
		 for (j = 0;j < 5;j++)
		 {
	t = a[n][j];
	a[n][j] = a[m][j];
	a[m][j] = t;
		 }
	 }
	 for (i = 0;i < 5;i++)
	 {
		 for (j = 0;j < 5;j++)
		 {
			 if (j < 4)
			 {
				 System.out.printf("%d ",a[i][j]);
			 }
			 else if (j == 4)
			 {
				 System.out.printf("%d\n",a[i][j]);
			 }
		 }
	 }
	 return 0;
	}


}

