package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		int l;
		int k = 0;
		int d = 0;
	int[] a = new int[100];
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		b[i] = a[i];
	}
	for (i = 1;i <= n;i++)
	{
	 for (j = i + 1;j <= n;j++)
	 {
		 if (a[i] == a[j])
		 {
			 b[j] = 0;
		 }
	 }
	}
	for (i = 1;i <= n;i++)
	{
		if (b[i] == 0)
		{
			k = k + 1;
		}
	}
	for (i = 1;i <= n;i++)
	{
		if (b[i] != 0)
		{
			d = d + 1;
	if (d == n - k)
	{
		System.out.printf("%d",b[i]);
	}
	else
	{
		System.out.printf("%d,",b[i]);
	}


		}
	}

	return 0;
	}

}

