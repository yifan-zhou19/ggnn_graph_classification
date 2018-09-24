package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)

		{
			for (j = 0;j < n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][n - 1] = Integer.parseInt(tempVar3);
		}
		}
			m = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 0)
					{
				m++;
				break;

					}

				}
			}
		l = 0;
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (a[i][j] == 0)
					{
				l++;

			break;
					}

				}
			}

	s = (l - 2) * (m - 2);
	System.out.printf("%d",s);
	}
}

