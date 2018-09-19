package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int s;
		int i;
		int j;
		int[][] x = new int[100][100];

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			a = 0;
			for (j = 0; j < n; j++)
			{
				if (x[i][j] == 255)
				{
					continue;
				}
				if (x[i][j] == 0)
				{
					a = a + 1;
				}
			}
			if (a > 0)
			{
				break;
			}
		}
		for (j = 0; j < n; j++)
		{
			b = 0;
			for (i = 0; i < n; i++)
			{
				if (x[i][j] == 255)
				{
					continue;
				}
				if (x[i][j] == 0)
				{
					b = b + 1;
				}
			}
			if (b > 0)
			{
				break;
			}
		}
		s = (a - 2) * (b - 2);
		System.out.printf("%d", s);
	}
}

