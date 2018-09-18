package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
		int i;
		int j;
		int x;
		int y;
		int s;
		int[][] m = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (m[i][j] == 0 && m[i + 1][j] == 0 && m[i][j + 1] == 0)
				{
					a = i;
					b = j;
				}
				if (m[i][j] == 0 && m[i][j - 1] == 0 && m[i - 1][j] == 0)
				{
					c = i;
					d = j;
				}
			}
		}
		x = c - a - 1;
		y = d - b - 1;
		s = x * y;
		System.out.printf("%d",s);
	}
}

