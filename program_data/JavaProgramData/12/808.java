package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int n;
		int x;
		int y;
		for (;;)
		{
			j = 0,n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1;i < 16;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				j++;
				if (a[i] == 0)
				{
					break;
				}
			}
			for (i = 0;i < j;i++)
			{
				for (k = i + 1;k < j;k++)
				{
					x = a[i] % a[k];
					y = a[i] / a[k];
					if ((x == 0) && (y == 2))
					{
						n++;
					}
				}
			}
			for (i = j - 1;i >= 0;i--)
			{
				for (k = i - 1;k >= 0;k--)
				{
					x = a[i] % a[k];
					y = a[i] / a[k];
					if ((x == 0) && (y == 2))
					{
						n++;
					}
				}
			}
			System.out.printf("%d\n",n);
		}
		return 0;
	}
}

