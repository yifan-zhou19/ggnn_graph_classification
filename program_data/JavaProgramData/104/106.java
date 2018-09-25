package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int k;
		int[] a = new int[12];
		int[] b = new int[12];

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
		for (i = 0;a[i] >= 2;i++)
		{
			a[i + 1] = a[i] / 2;
		}
		for (k = 0;b[k] >= 2;k++)
		{
			b[k + 1] = b[k] / 2;
		}
		if (x != y)
		{
			for (;;i--,k--)
			{
				if (a[i] != b[k])
				{
					break;
				}
			}
			System.out.printf("%d\n",a[i + 1]);
		}
		else
		{
			System.out.printf("%d\n",x);
		}

	}
}

