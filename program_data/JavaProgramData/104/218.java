package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int x;
		int y;
		int[] a = new int[500];
		int[] b = new int[500];
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
		for (i = 1;a[i - 1] > 1;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
		}
		for (j = 1;b[j - 1] > 1;j++)
		{
			if (b[j - 1] % 2 == 0)
			{
				b[j] = b[j - 1] / 2;
			}
			else
			{
				b[j] = (b[j - 1] - 1) / 2;
			}
		}
		for (i = 0;a[i] != 0;i++)
		{
			for (j = 0;b[j] != 0;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
			if (a[i] == b[j])
			{
				break;
			}
		}
	}
}

