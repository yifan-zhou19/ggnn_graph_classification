package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int i;
		int j;
		int k = 0;
		int[] a = new int[100];
		int[] b = new int[100];
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
		a[1] = x;
		b[1] = y;
		for (i = 1;a[i] > 1;i++)
		{
			if (a[i] % 2 == 0)
			{
				a[i + 1] = a[i] / 2;
			}
			else
			{
				a[i + 1] = (a[i] - 1) / 2;
			}
		}
		for (j = 1;b[j] > 1;j++)
		{
			if (b[j] % 2 == 0)
			{
				b[j + 1] = b[j] / 2;
			}
			else
			{
				b[j + 1] = (b[j] - 1) / 2;
			}
		}
		for (i = 1;a[i] >= 1;i++)
		{
			for (j = 1;b[j] >= 1;j++)
			{
				if (b[j] == a[i])
				{
					System.out.printf("%d",b[j]);
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
			break;
			}
		}
	}
}

