package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int t;
		int i;
		int j;
		int sum = 0;
		int m;
		int n;
		int k;
		int[] p = null;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t < k;t++)
		{
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			p = a;
			for (i = 0;i <= n - 2;i++)
			{
				sum += *(p[0] + i);
			}
			p = a;
			for (i = 0;i <= m - 2;i++)
			{
				sum += *(p[i] + n - 1);
			}
			p = a;
			for (i = 1;i <= n - 1;i++)
			{
				sum += *(p[m - 1] + i);
			}
			p = a;
			for (i = 1;i <= m - 1;i++)
			{
				sum += *(p[i] + 0);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

