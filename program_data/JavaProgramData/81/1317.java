package <missing>;

public class GlobalMembers
{
	public static int panduan(int x,int y)
	{
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
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
		 int i;
		 int j;
		 int m;
		 int n;
		 int t;
		 int pd = 0;
		 int[][] a = new int[5][5];
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
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 pd = panduan(m, n);
		 if (pd == 0)
		 {
			 System.out.print("error\n");
		 }
		 else
		 {
			 for (j = 0;j < 5;j++)
			 {
				 t = a[m][j];
				 a[m][j] = a[n][j];
				 a[n][j] = t;
			 }
			for (i = 0;i < 5;i++)
			{
			 for (j = 0;j < 5;j++)
			 {
				 if (j != 4)
				 {
				 System.out.printf("%d ",a[i][j]);
				 }
				 if (j == 4)
				 {
					 System.out.printf("%d\n",a[i][j]);
				 }
			 }
			}
		 }
		 return 0;

	}

}

