package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int[] a = new int[MAX];
	int n;
	int m = 0;
	int k = 0;
	int j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	n = n - 2;
	while (i <= n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	i = i + 1;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	i = 0;
	n = n + 1;
	while (i <= n)
	{
	if (m <= a[i])
	{
		m = a[i];
	}

	i = i + 1;
	}
	j = 0;
	while (j <= n)
	{
	if (k <= a[j] != 0 && a[j] != m)
	{
		k = a[j];
	}

	j = j + 1;
	}

	System.out.printf("%d\n",m);
	System.out.printf("%d\n",k);

		return 0;
	}
}

