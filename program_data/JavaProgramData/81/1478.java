package <missing>;

public class GlobalMembers
{
	public static int f(int[][] a, int m, int n)
	{
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int p;
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
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  p = f(a[5][5], m, n);
		  if (p == 0)
		  {
			  System.out.print("error");
		  }
		  if (p == 1)
		  {
			  for (i = 0;i < 5;i++)
			  {
				  int t;
				  t = a[m][i];
				  a[m][i] = a[n][i];
				  a[n][i] = t;
			  }
			  for (i = 0;i < 5;i++)
			  {
				 for (j = 0;j < 4;j++)
				 {
					 System.out.printf("%d ",a[i][j]);
				 }
				 System.out.printf("%d", a[i][4]);
				 System.out.print("\n");
			  }
		  }
	}

}

