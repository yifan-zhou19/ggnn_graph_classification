package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int m;
	int n;
	int[] a = new int[200];
	int[] b = new int[200];
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = 0;
	q = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (m = 0;m < n;m++)
	{
		if (a[m] == b[m])
		{
			p = p;
			q = q;
		}
		else if (a[m] == 0 && b[m] == 1)
		{
		p = p + 1;
		q = q;
		}
		else if (a[m] == 0 && b[m] == 2)
		{
		p = p;
		q = q + 1;
		}
		else if (a[m] == 1 && b[m] == 0)
		{
		p = p;
		q = q + 1;
		}
		else if (a[m] == 1 && b[m] == 2)
		{
		p = p + 1;
		q = q;
		}
		else if (a[m] == 2 && b[m] == 0)
		{
		p = p + 1;
		q = q;
		}
		else if (a[m] == 2 && b[m] == 1)
		{
		p = p;
		q = q + 1;
		}
	}
	if (p > q)
	{
	System.out.print("A");
	}
	if (p < q)
	{
	System.out.print("B");
	}
	if (p == q)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

