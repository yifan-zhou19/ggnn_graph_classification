package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int min = 0;
		int num;
		int[][] s = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= n;l++)
		{
			num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					*(*(s + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (k = 0;k <= n - 2;k++)
			{
				for (i = 1;i <= n - k;i++)
				{
					min = s[i][1];
					for (j = 1;j <= n - k;j++)
					{
						if (*(*(s + i) + j) < min)
						{
							min = (*(s + i) + j);
						}
					}
					for (j = 1;j <= n - k;j++)
					{
						*(*(s + i) + j) -= min;
					}
				}
				for (j = 1;j <= n - k;j++)
				{
					min = s[1][j];
					for (i = 1;i <= n - k;i++)
					{
						if (*(*(s + i) + j) < min)
						{
							min = (*(s + i) + j);
						}
					}
					for (i = 1;i <= n - k;i++)
					{
						*(*(s + i) + j) -= min;
					}
				}
				num += s[2][2];
				for (i = 1;i <= n - k;i++)
				{
					for (j = 2;j <= n - k - 1;j++)
					{
						*(*(s + i) + j) = *(*(s + i) + j + 1);
					}
				}
				for (j = 1;j <= n - k;j++)
				{
					for (i = 2;i <= n - k - 1;i++)
					{
						*(*(s + i) + j) = *(*(s + i + 1) + j);
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

