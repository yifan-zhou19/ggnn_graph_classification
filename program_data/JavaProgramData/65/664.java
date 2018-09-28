package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int p;
	int q;
	int[] a = new int[200];
	int[] b = new int[200];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] == b[i] + 1)
	{
	q = q + 1;
	}
	else if (a[i] == b[i] + 2)
	{
	p = p + 1;
	}
	else if (a[i] == b[i] - 1)
	{
	p = p + 1;
	}
	else if (a[i] == b[i] - 2)
	{
	q = q + 1;
	}
	}
	if (p > q)
	{
	System.out.print("A");
	}
	else if (p == q)
	{
	System.out.print("Tie");
	}
	else if (p < q)
	{
	System.out.print("B");
	}
	return 0;
	}
}

