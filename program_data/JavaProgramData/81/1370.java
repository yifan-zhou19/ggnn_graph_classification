package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int Main()
	{
		int swap = new int(int x[5][5],int n,int m);
		int i;
		int j;
		int n;
		int m;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (swap(a, n, m) == 1)
		{
			 for (i = 0;i < 5;i++)
			 {
				 for (j = 0;j < 4;j++)
				 {
					 System.out.printf("%d ",a[i][j]);
				 }
				 System.out.printf("%d\n",a[i][4]);
			 }
		}
		else if (swap(a, n, m) == 0)
		{
			 System.out.print("error");
		}
		return 0;
	}

	public static int swap(int[][] a, int n, int m)
	{
		int f;
		int i;
		int t;
		if ((n < 5) && (m < 5))
		{
		   f = 1;
		   for (i = 0;i < 5;i++)
		   {
			   t = a[n][i];
			   a[n][i] = a[m][i];
			   a[m][i] = t;
		   }
		}
		else
		{
			f = 0;
		}
		return (f);
	}
}

