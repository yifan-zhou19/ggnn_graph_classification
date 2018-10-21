package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int y = 0;
		int t;
		int i;
		int j;
		int[] x = new int[300];
		int z = 0;
		char c;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
				for (j = 0;j < i;j++)
				{
					if (x[j] == x[j + 1])
					{
						z++;
					}
				}
				if (z == i)
				{
					System.out.print("No");
				}
				else
				{
		for (j = 1;j <= i;j++)
		{
			for (k = 0;k <= i - j;k++)
			{
				if (x[k] < x[k + 1])
				{
					t = x[k];
					x[k] = x[k + 1];
					x[k + 1] = t;
				}
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (x[j] > x[j + 1])
			{
				System.out.printf("%d",x[j + 1]);
			y = 1;
			break;
			}
		}
		if (y == 0)
		{
			System.out.print("No");
		}
				}
		}
	}

}

