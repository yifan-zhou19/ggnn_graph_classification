package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[8][8];
		int i;
		int j;
		int p;
		int q;
		int b;
		int k;
		int t;
		int w;
		int u = 0;
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
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zui
	//	{
	//		int x,y;
	//		int z;
	//	}
	//	c[8];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (j == 0)
				{
					b = a[i][0];
					p = i;
					q = 0;
					continue;
				}
				if (a[i][j] > b)
				{
					b = a[i][j];
					p = i;
					q = j;
				}
			}
			c[i].x = q;
			c[i].y = p;
			c[i].z = a[p][q];
		}
		for (k = 0;k < n;k++)
		{
			w = c[k].x;
			for (t = 0;t < n;t++)
			{
				if (c[k].z > a[t][w])
				{
					break;
				}
				else if (t == n - 1)
				{
					System.out.printf("%d+%d",c[k].y,c[k].x);
					u++;
				}
			}
		}
		if (u == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

