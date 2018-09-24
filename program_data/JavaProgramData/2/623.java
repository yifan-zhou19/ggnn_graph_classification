package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
		int[] c = new int[91];
		int max = 0;
		char[][] b = new char[1000][26];
		char d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < 26;j++)
			{
				if (b[i][j] > 0)
				{
					c[b[i][j]]++;
				}
			}
		}
		for (i = 65;i < 91;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 65;i < 91;i++)
		{
			if (c[i] == max)
			{
				d = i;
				System.out.print(d);
				System.out.print("\n");
				System.out.print(max);
				System.out.print("\n");
				for (j = 0;j < m;j++)
				{
					for (k = 0;k < 26;k++)
					{
						if (b[j][k] == d)
						{
							System.out.print(a[j]);
							System.out.print("\n");
							break;
						}
					}
				}
			}
		}
		return 0;
	}
}

