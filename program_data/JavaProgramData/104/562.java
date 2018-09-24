package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = {100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = {100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		for (i = 0;a[i] >= 1;i++)
		{
			a[i + 1] = a[i] / 2;

		}

		for (j = 0;b[j] >= 1;j++)
		{
			b[j + 1] = b[j] / 2;

		}
	for (i = 0;i <= 12;i++)
	{
	for (j = 0;j <= 12;j++)
	{
	if (a[i] == b[j])
	{
		System.out.printf("%d\n",a[i]);
	return 0;
	}
	}
	}

	}


}

