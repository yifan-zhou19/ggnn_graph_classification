package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int m;
		int n;
		int x = 0;
		int y = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m == n)
		{
			System.out.printf("%d\n",m);
		}
		else
		{
			a[0] = m;
			b[0] = n;
			for (i = 1;m != 1;i++)
			{
				if (m % 2 == 0)
				{
					m = m / 2;
				}
				else
				{
					m = (m - 1) / 2;
				}
				a[i] = m;
			}
			for (i = 1;n != 1;i++)
			{
				if (n % 2 == 0)
				{
					n = n / 2;
				}
				else
				{
					n = (n - 1) / 2;
				}
				b[i] = n;
			}
			for (i = 0;a[i] != 0;i++)
			{
				x = x + 1;
			}
			for (i = 0;b[i] != 0;i++)
			{
				y = y + 1;
			}
			if (a[0] == 1 || b[0] == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				for (i = 1;x - 1 - i >= 0 && y - 1 - i >= 0;i++)
				{
					if (a[x - 1 - i] != b[y - 1 - i])
					{
						 break;
					}
				}
				System.out.printf("%d\n",a[x - i]);
			}
		}
	}
}

