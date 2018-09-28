package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[][] l = new int[1001][1001];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0,t = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						t = a[j + 1];
						a[j + 1] = a[j];
						a[j] = t;
					}
				}
			}
			for (i = 0,t = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (b[j] < b[j + 1])
					{
						t = b[j + 1];
						b[j + 1] = b[j];
						b[j] = t;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b[i] < a[0])
				{
				   l[i][0] = 200;
				}
				else if (b[i] == a[0])
				{
				   l[i][0] = 0;
				}
				else
				{
				   l[i][0] = -200;
				}
			}
			for (i = n - 2;i >= 0;i--)
			{
				for (j = 1;j < n - i;j++)
				{
					if (b[i + j] < a[j])
					{
					   l[i][j] = l[i][j - 1] + 200;
					}
					else if (b[i + j] > a[j])
					{
					   l[i][j] = l[i + 1][j - 1] - 200;
					}
					else if (l[i + 1][j - 1] - 200 > l[i][j - 1])
					{
					   l[i][j] = l[i + 1][j - 1] - 200;
					}
					else
					{
					   l[i][j] = l[i][j - 1];
					}
				}
			}
			System.out.printf("%d\n",l[0][n - 1]);
		} while (n != 0);
		System.in.read();
		System.in.read();
	}
}

