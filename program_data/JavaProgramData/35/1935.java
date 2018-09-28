package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[10][10];
	   int[][] b = new int[10][2];
	   int i;
	   int j;
	   int m;
	   int n;
	   int x;
	   int k;
	   int y;
	   int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < m;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		}
		}
	   for (i = 0;i < n;i++)
	   {
			max = a[i][0];
			for (j = 0;j < m;j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					x = j;
				}
			}
			 b[i][0] = max;
			 b[i][1] = x;
	   }
		y = 0;
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{
				if (b[i][0] > a[j][b[i][1]])
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d+%d\n",i,b[i][1]);
				y = 1;
				break;
			}
		}
		if (y == 0)
		{
			System.out.print("No\n");
		}

	}
}

