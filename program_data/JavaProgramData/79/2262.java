package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int r;
		int p;
		int[] a = new int[300];
		for (j = 0;j < 300;j++)
		{
			a[j] = 1;
		}
		for (j = 1;;j++)
		{

			r = 0;
			k = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (p = 0;p < 300;p++)
			{
				a[p] = 1;
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					if (a[i] == 1)
					{
						k = 0;
						r++;
					}
					else
					{
						k++;
					}
					if (r == m)
					{
						a[i] = 0;
						r = 0;
						k = 0;
					}
					if (i == n - 1)
					{
						i = -1;
					}
					if (k == n - 1)
					{
						if (i < n - 1)
						{
							i++;
						}
						break;
					}
				}
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

