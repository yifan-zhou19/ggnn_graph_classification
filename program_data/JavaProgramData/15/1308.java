package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int i;
		int j;
		int n;
		int b = 0;
		int c;
		int d = 0;
		int m;
		int s;

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
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 0)
					{
						b = i;
						c = j;
						break;

					}
				}
				if (b != 0)
				{
					break;
				}
			}
				for (i = n - 1;i >= 0;i--)
				{
					for (j = n - 1;j >= 0;j--)
					{

						if (a[i][j] == 0)
						{
							d = i;
							m = j;
							break;
						}
					}
					if (d != 0)
					{
						break;
					}
				}
					s = (d - b - 1) * (m - c - 1);
					System.out.printf("%d",s);

					return 0;
	}

}

