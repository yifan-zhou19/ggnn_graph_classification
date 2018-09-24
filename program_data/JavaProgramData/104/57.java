package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[500];
		int[] b = new int[500];
		int i = 1;
		int j;
		int m = 0;
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
		a[0] = x;
		b[0] = y;
		while (x != 0)
		{
			a[i] = x / 2;
			x = x / 2;
			i++;
		}
		i = 1;
		while (y != 0)
		{
			b[i] = y / 2;
			y = y / 2;
			i++;
		}
		for (i = 0;a[i] != 0;i++)
		{
			for (j = 0;b[j] != 0;j++)
			{
				if (a[i] == b[j])
				{
					m = i;
					break;
				}
			}
			if (m == 0 && a[0] == b[0])
			{
				break;
			}
			else if (m != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n", a[m]);
	}

}

