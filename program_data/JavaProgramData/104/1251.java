package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int m = 0;
		int n = 0;
		int t;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
			for (i = 1;a[i - 1] != 1;i++)
			{
				a[i] = x / 2;
				x = x / 2;
				m = m + 1;
			}
			for (j = 1;b[j - 1] != 1;j++)
			{
				b[j] = y / 2;
				y = y / 2;
				n = n + 1;
			}


			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i] == b[j])
					{
						t = 1;
						break;
					}
				}
				if (t == 1)
				{
					break;
				}
			}
			System.out.printf("%d\n",a[i]);
			return 0;
	}

}

