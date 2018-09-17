package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int sign = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
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

		if (x < y)
		{
			a[0] = x;
			b[0] = y;
		}
		else
		{
			a[0] = y;
			b[0] = x;
		}

		for (i = 1;;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 0)
			{
				break;
			}
		}

		for (i = 1;;i++)
		{
			b[i] = b[i - 1] / 2;
			if (b[i] == 0)
			{
				break;
			}
		}

		for (i = 0;a[i] != 0;i++)
		{
			for (j = 0;b[j] != 0;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					sign = 1;
					break;
				}
			}
			if (sign == 1)
			{
				break;
			}
		}
		return 0;
	}







}

