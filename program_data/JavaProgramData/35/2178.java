package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] s = new int[9][9];
		int i;
		int j;
		int t = -100;
		int c;
		int f = 0;
		int g;
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
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < m;i++)
	{
		c = 0;
		for (j = 0;j < n;j++)
		{
			if (s[i][j] > s[i][c])
			{
				c = j;
			}
		}
	g = 0;
	for (j = 0;j < m;j++)
	{
		if (s[j][c] < s[i][c])
		{
		g++;
		break;
		}
	}
	if (g == 0)
	{
		f++;
		break;
	}
	}
	if (f != 0)
	{
		System.out.printf("%d+%d\n",i,c);
	}
	else
	{
		System.out.print("No\n");
	}
	}
}

