package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int h = 1;
		int v = 0;
		int i;
		int j;
		int[][] array = new int[100][100];
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(array,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			h = 1;
			v = 0;
			while (m > 0 && n > 0)
			{
				if (m != 1 && n != 1)
				{
					for (i = 1;i <= n;i++)
					{
						v++;
						System.out.print(array[h][v]);
						System.out.print("\n");
					}
					for (i = 1;i <= m - 1;i++)
					{
						h++;
						System.out.print(array[h][v]);
						System.out.print("\n");
					}
					for (i = 1;i <= n - 1;i++)
					{
						v--;
						System.out.print(array[h][v]);
						System.out.print("\n");
					}
					for (i = 1;i <= m - 2;i++)
					{
						h--;
						System.out.print(array[h][v]);
						System.out.print("\n");
					}
					m = m - 2;
					n = n - 2;
				}
				else if (m == 1)
				{
					for (i = 1;i <= n;i++)
					{
						v++;
						System.out.print(array[h][v]);
						System.out.print("\n");
					}
					m = m - 2;
					n = n - 2;
				}
				else
				{
					v++;
					for (i = 1;i <= m;i++)
					{
						System.out.print(array[h][v]);
						System.out.print("\n");
						h++;
					}
					m = m - 2;
					n = n - 2;
				}
			}
		}
		return 0;
	}
}

