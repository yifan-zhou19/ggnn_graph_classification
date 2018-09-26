package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[max];
		int[] b = new int[max];
		int m = 0;
		int q = 0;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
	for (i = 0;i < n;i++)
	{
		if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
		{
		m++;
		}
	else
	{
		if ((b[i] == 0 && a[i] == 1) || (b[i] == 1 && a[i] == 2) || (b[i] == 2 && a[i] == 0))
		{
		q++;
		}
	else
	{
		m++;
	q++;
	}
	}
	}
	if (m > q)
	{
		System.out.print("A\n");
	}
	else
	{
		if (m == q)
		{
		System.out.print("Tie\n");
		}
	else
	{
		System.out.print("B\n");
	}
	}
	return 0;
	}
}

