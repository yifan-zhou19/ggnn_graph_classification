package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] f = new int[102][102];
		int i;
		int j;
		int n;
		int m;
		int m1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 100;i++)
		{
			f[i][0] = 1;
		}
		for (i = 1;i <= 100;i++)
		{
		 for (j = 1;j <= 100;j++)
		 {
		  if (j >= i)
		  {
			  f[i][j] = f[i - 1][j] + f[i][j - i];
		  }
			else
			{
				f[i][j] = f[i - 1][j];
			}
		 }
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  m1 = Integer.parseInt(tempVar3);
		  }
		  System.out.printf("%ld\n",f[m1][m]);
		}
	}

}

