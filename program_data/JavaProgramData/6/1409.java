package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int m;
	public static int n;
	public static int sum;
	public static int[][] num = new int[101][101];
	public static int Main()
	{
		int i;
		int j;
		int l;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(num,0,(Integer.SIZE / Byte.SIZE));
				sum = 0;
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0;j < m;++j)
				{
						for (l = 0;l < n;++l)
						{
								num[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
				}
				for (j = 0;j < n;++j)
				{
					sum += num[0][j] + num[m - 1][j];
				}
				for (j = 1;j < m - 1;++j)
				{
					sum += num[j][0] + num[j][n - 1];
				}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}

}

