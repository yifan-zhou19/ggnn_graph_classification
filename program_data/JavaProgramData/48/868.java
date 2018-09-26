package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static int n;
	public static void inf(int m)
	{
	  int i;
	  int j;
	  for (i = 1;i <= 9;i++)
	  {
		 for (j = 1;j <= 9;j++)
		 {
			b[i][j] = 2 * a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i][j - 1] + a[i - 1][j] + a[i + 1][j + 1] + a[i - 1][j - 1] + a[i + 1][j - 1] + a[i - 1][j + 1];
		 }
	  }
	  for (i = 1;i <= 9;i++)
	  {
		 for (j = 1;j <= 9;j++)
		 {
			a[i][j] = b[i][j];
		 }
	  }
	   if (m < n)
	   {
		   inf(m + 1);
	   }
	}
	public static int Main()
	{
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[5][5] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  inf(1);
	  for (i = 1;i <= 9;i++)
	  {
		 for (j = 1;j <= 8;j++)
		 {
			System.out.printf("%d ",a[i][j]);
		 }
		 System.out.printf("%d\n",a[i][9]);
	  }
	  return 0;
	}

}

