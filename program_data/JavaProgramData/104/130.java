package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int j;
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
		for (i = 1;;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 1)
			{
				break;
			}
		}
		for (j = 1;;j++)
		{
			b[j] = b[j - 1] / 2;
			if (b[j] == 1)
			{
				break;
			}
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					break;
				}
				else if (b[j] == 1)
				{
					break;
				}
			}
			if (a[i] == b[j])
			{
				break;
			}
			else
			{
				continue;
			}
		}
	}
}

