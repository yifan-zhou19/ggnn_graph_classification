package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int[] a = new int[1000];
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
		for (i = 1,a[0] = x;;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
			if (a[i] == 1 || a[0] == 1)
			{
				break;
			}
		}
		for (;y >= 1;)
		{
			for (i = 0;a[i] >= 1;i++)
			{
				if (y == a[i])
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
			if (y == a[i])
			{
				break;
			}
			else
			{
					if (y % 2 == 0)
					{
						y = y / 2;
					}
					else
					{
						y = (y - 1) / 2;
					}
			}
		}
		return 0;
	}

}

