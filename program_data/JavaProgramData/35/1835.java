package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int a;
		int b;
		int i;
		int j;
		int u;
		int x;
		int k;
		int l;
		int e = 0;
		int f = 0;
		char c = '+';
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			x = sz[i][0];
			k = 0;
			l = 0;
			for (j = 0;j < b;j++)
			{
				if (sz[i][j] > x)
				{
					x = sz[i][j];
					l = i;
					k = j;
				}
			}
			for (u = 0;u < a;u++)
			{
				if (sz[u][k] < x)
				{
					e++;
				}
			}
			if (e == 0)
			{
				System.out.printf("%d%c%d\n",l,c,k);
				f = f + 1;
				break;
			}
		}
		if (f == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}






}

