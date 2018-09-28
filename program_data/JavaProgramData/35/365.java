package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int a;
		int b;
		int t;
		int count = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			a = i,b = 0;
			for (k = 0;k < n;k++)
			{
				if (s[i][k] > s[i][0])
				{
					a = i,b = k;
				}
			}
			for (t = 0;t < m;t++)
			{
				if (s[a][b] > s[t][b])
				{
					count++;
				}
			}
			if (count == 0)
			{
				System.out.printf("%d+%d",a,b);
				x++;
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		return 0;
	}













}

