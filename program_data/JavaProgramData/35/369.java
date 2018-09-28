package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int col = 0;
		int line = 0;
		int k = 0;
		int[][] a = new int[8][8];
		int l;
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
			for (j = 0;j < m;j++)
			{
			if (a[i][j] > a[i][line])
			{
				line = j;
			}
			}
			for (l = 0;l < n;l++)
			{
			if (a[i][line] > a[l][line])
			{
				break;
			}
			}
			if (l == n)
			{
				col = i;
				k = 1;
				break;
			}
			line = 0;
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d+%d\n",col,line);
		}
	}


}

