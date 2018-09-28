package <missing>;

public class GlobalMembers
{
	public static int[][] c = new int[9000][9000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[9000];
		int[] b = new int[9000];
		int[] d = new int[9000];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d, 0, (Integer.SIZE / Byte.SIZE));
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			if (a[i] == b[i])
			{
				continue;
			}
			c[a[i]][b[i]] = 1;
			i++;
		}
		for (i = 0; i < n; i++)
		{
			if (d[i] == 1)
			{
				continue;
			}
			for (j = 0; j < n; j++)
			{
				if (i == j)
				{
					continue;
				}
				if (c[i][j] == 1)
				{
					d[i] = 1;
					break;
				}
				if (c[i][j] == 0)
				{
					d[j] = 1;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (d[i] == 1)
			{
				continue;
			}
			sum = 0;
			for (j = 0; j < n; j++)
			{
				sum += c[j][i];
			}
			if (sum == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;
	}

}

