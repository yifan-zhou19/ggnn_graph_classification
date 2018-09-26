package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[200];
		int[] b = new int[200];
		int t = 0;
		int e;
		int p = 0;
		int m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				t++;
			}
	else if (a[i] == b[i])
	{
	p++;
	}
		}
	m = n - p;
	if (m != 0)
	{
		if (m % 2 == 0)
		{
			e = m / 2;
			if (t == e)
			{
			System.out.print("Tie");
			}
	else if (t > e)
	{
	System.out.print("A");
	}
	else
	{
	System.out.print("B");
	}
		}
	else
	{
	e = m / 2;
	if (t > e)
	{
	System.out.print("A");
	}
	else
	{
	System.out.print("B");
	}
	}
	}
	else
	{
	System.out.print("Tie");
	}
	return 0;
	}

}

