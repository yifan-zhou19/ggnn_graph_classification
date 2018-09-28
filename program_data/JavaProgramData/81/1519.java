package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
		int fac = new int(int a[5][5],int n,int m);
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
		if (fac(a, n, m) == 1)
		{
			  for (i = 0;i < 5;i++)
			  {
				  for (j = 0;j < 5;j++)
				  {
					if (j < 4)
					{
						System.out.printf("%d ",a[i][j]);
					}
					else
					{
						System.out.printf("%d\n",a[i][j]);
					}
				  }
			  }
		}
		else
		{
			System.out.print("error");
		}
	}

	 public static int fac(int[][] a, int n, int m)
	 {
		int i;
		int j;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				 j = a[m][i];
				 a[m][i] = a[n][i];
				 a[n][i] = j;
			}
			return (1);
		}
		else
		{
		return (0);
		}
	 }
}

