package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < n;k++)
		{
			int[][] a = new int[100][100];
			int ans = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int p = 0;p < n - 1;p++)
			{
				int min =  a;
				for (i = 0;i < n - p;i++) //???
				{
					for (j = 0;j < n - p;j++)
					{
						if (min > *(*(a + i) + j))
						{
							min = (*(a + i) + j);
						}
					}
					for (j = 0;j < n - p;j++)
					{
						*(*(a + i) + j) -= min;
					}
					min = *(a + i + 1);
				}
				min =  a; //???
				for (i = 0;i < n - p;i++)
				{
					for (j = 0;j < n - p;j++)
					{
						if (min > *(*(a + j) + i))
						{
							min = (*(a + j) + i);
						}
					}
					for (j = 0;j < n - p;j++)
					{
						*(*(a + j) + i) -= min;
					}
					min = (a + i + 1);
				}
				ans += *(*(a + 1) + 1);
				for (i = 1;i < n - p;i++) //??
				{
					for (j = 0;j < n - p;j++)
					{
						*(*(a + i) + j) = *(*(a + i + 1) + j);
					}
				}
				for (i = 1;i < n - p;i++) //??
				{
					for (j = 0;j < n - 1 - p;j++)
					{
						*(*(a + j) + i) = *(*(a + j) + i + 1);
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
			ans = 0;
		}
		return 0;
	}
}

