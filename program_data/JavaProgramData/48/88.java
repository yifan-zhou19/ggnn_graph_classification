package <missing>;

public class GlobalMembers
{
	public static void fanzhi()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(zhen,0,(Integer.SIZE / Byte.SIZE));
	   for (i = 0;i <= 8;i++)
	   {
		 for (j = 0;j <= 8;j++)
		 {
		   zhen[i + 1][j] += a[i][j];
		   zhen[i][j] += a[i][j] * 2;
		   zhen[i - 1][j] += a[i][j];
		   zhen[i][j - 1] += a[i][j];
		   zhen[i][j + 1] += a[i][j];
		   zhen[i + 1][j + 1] += a[i][j];
		   zhen[i - 1][j + 1] += a[i][j];
		   zhen[i + 1][j - 1] += a[i][j];
		   zhen[i - 1][j - 1] += a[i][j];
		 }
	   }
		for (i = 0;i <= 8;i++)
		{
		  for (j = 0;j <= 8;j++)
		  {
			  a[i][j] = zhen[i][j];
		  }
		}
	}
	public static int[][] a = new int[9][9];
	public static int[][] zhen = new int[9][9];
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (i = 1;i <= n;i++)
		{
		  fanzhi();
		}
	   for (i = 0;i <= 8;i++)
	   {
		 for (j = 0;j <= 7;j++)
		 {
		 System.out.print(a[i][j]);
		 System.out.print(" ");
		 }
		 System.out.print(a[i][8]);
		 System.out.print("\n");
	   }

		return 0;
	}
}

