package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int x,int y);
		int[] b = new int[5];
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] a = new int[5][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
			k = change(n, m);
		if (k == 0)
		{
			System.out.print("error");

		}
		else if (k == 1)
		{
			   for (i = 0;i <= 4;i++)
			   {
				   b[i] = a[n][i];
			   }
			  for (i = 0;i <= 4;i++)
			  {
				  a[n][i] = a[m][i];
			  }
			  for (i = 0;i <= 4;i++)
			  {
				  a[m][i] = b[i];
			  }
	for (i = 0;i <= 4;i++)

	{


				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
	}
		}
	}
	public static int change(int x,int y)
	{
		int z;
		if (0 <= x != 0 && x <= 4 && 0 <= y != 0 && y <= 4 && x != y)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}



}

