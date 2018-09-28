package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int g;
		int h;
		int k;
		int l;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			g = 0;
			j = 0;
			h = 0;
			l = 0;
		for (i = 0;i < m;i++)
		{

			for (j = i;j < n - i;j++)
			{
			if (l == m * n)
			{
				break;
			}


				System.out.printf("%d\n",a[i][j]);
				l++;
		   if (l == m * n)
		   {
				break;
		   }

			}
			j = n - i - 1;
			for (g = i + 1;g < m - i;g++)
			{
			if (l == m * n)
			{
				break;
			}


				System.out.printf("%d\n",a[g][j]);
				l++;
			if (l == m * n)
			{
				break;
			}

			}
			k = m - i - 1;
			for (j = n - i - 2;j >= i;j--)
			{
			if (l == m * n)
			{
				break;
			}



				System.out.printf("%d\n",a[k][j]);
				l++;
		   if (l == m * n)
		   {
				break;
		   }

			}
			for (h = m - i - 2;h > i;h--)
			{
			if (l == m * n)
			{
				break;
			}



				System.out.printf("%d\n",a[h][i]);
				l++;
		   if (l == m * n)
		   {
				break;
		   }


			}
			if (l == m * n)
			{
				break;
			}



		}
		return 0;
	}
}

