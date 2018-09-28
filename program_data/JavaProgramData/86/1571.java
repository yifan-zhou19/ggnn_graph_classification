package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int[] m = new int[100];
		int n;
		int j;
		int i;
		int f;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] == 0)
			{
				f = 1;
			}
			for (j = 0;j < m[i];j++)
			{
				if (a[i][j] + 3 * m[i] > 60)
				{
					f = 0;
					q = j;
					break;
				}
				else
				{
				f = 1;
				}
			}
			if (f == 0)
			{
				if (a[i][q] > (60 - 3 * q))
				{
					System.out.printf("%d\n",(60 - 3 * q));
				}
				else
				{
				System.out.printf("%d\n",a[i][q]);
				}
			}
			if (f == 1)
			{
				System.out.printf("%d\n",(60 - 3 * m[i]));
			}
		}

	 return 0;
	}









}

