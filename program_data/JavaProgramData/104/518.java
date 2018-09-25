package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int j;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == y)
		{
			System.out.printf("%d",x);
		}
		else
		{
			if ((x == 1) || (y == 1))
			{
				System.out.print("1");
			}

			else
			{
				a[0] = x;
				for (i = 1;i < 20;i++)
				{
					if (a[i - 1] % 2 == 0)
					{
						a[i] = a[i - 1] / 2;
					}
					else
					{
						a[i] = (a[i - 1] - 1) / 2;
					}
					if (a[i] == 1)
					{
						p = i;
						break;
					}
				}
				b[0] = y;
				for (i = 1;i < 20;i++)
				{
					if (b[i - 1] % 2 == 0)
					{
						b[i] = b[i - 1] / 2;
					}
					else
					{
						b[i] = (b[i - 1] - 1) / 2;
					}
					if (b[i] == 1)
					{
						q = i;
						break;
					}
				}
				for (i = 0;i <= p;i++)
				{
					for (j = 0;j <= q;j++)
					{
						if (a[i] == b[j])
						{
							p = i;
							break;
						}
					}
				}
			System.out.printf("%d",a[p]);
			}
		}
		return 0;
	}

}

