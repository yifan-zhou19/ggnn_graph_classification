package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] n = new int[300];
		int[] m = new int[300];
		int i;
		int j;
		int b;
		int k = 0;
		int x = 0;
		int y = 0;
		for (i = 0;;i++)
		{
			k = k + 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		for (b = 0,x = 0,y = 0;;b++)
		{
			x = 0;
			for (i = 0;;i++)
			{
				if (a[i] == 0)
				{
					x = x + 1;
					if (x == m[b])
					{
						a[i] = 1;
						x = 0;
					}
				}
				if (i == n[b] - 1)
				{
					i = -1;
				}
				for (j = 0,y = 0;j < n[b];j++)
				{
					y = y + a[j];
				}
				if (y == n[b] - 1)
				{
					break;
				}


			}

			for (i = 0;i < n[b];i++)
			{
				if (a[i] == 0)
				{
					System.out.printf("%d\n",i + 1);
					break;
				}
			}
			for (i = 0;i < 300;i++)
			{
				a[i] = 0;
			}

			if (n[b + 1] == 0 && m[b + 1] == 0)
			{
				break;
			}
		}
		return 0;
	}

}

