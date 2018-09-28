package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int p = 0;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	n = a[0];
	i = 1;
	while (System.in.read() == ',')
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i++] = Integer.parseInt(tempVar2);
		}
	}
	k = i;
	if (k == 1)
	{
		System.out.print("No");
	}
	else
	{
		for (i = 1;i < k;i++)
		{
	if (a[i] == a[0])
	{
		p += 1;
	}
		}
	if (p == k - 1)
	{
		System.out.print("No");
	}
	if (p != k - 1)
	{
		for (i = 1;i < k;i++)
		{
	n = n > a[i] != 0?n:a[i];
		}
	for (i = 0;i < k;i++)
	{
	if (a[i] == n)
	{
	a[i] = 0;
	}
	}
	n = 0;
	for (i = 0;i < k;i++)
	{
	n = n > a[i] != 0?n:a[i];
	}
	System.out.printf("%d",n);
	}
	}
	}

}

