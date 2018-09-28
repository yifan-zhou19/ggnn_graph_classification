package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] t = new int[50][6];
	int i;
	int k;
	int s;
	int a;
	int x;
	for (i = 0;i < 50;i++)
	{
		for (k = 0;k < 6;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i][k] = Integer.parseInt(tempVar);
			}
		}
	}
	for (i = 0;t[i][0] != 0;i++)
	{
			a = t[i][0] * 60 * 60 + t[i][1] * 60 + t[i][2];
			x = (t[i][3] + 12) * 60 * 60 + t[i][4] * 60 + t[i][5];
			s = x - a;
			System.out.printf("%d\n",s);
	}
		return 0;
	}
}

