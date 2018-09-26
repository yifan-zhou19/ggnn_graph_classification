package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int n;
	int t = 0;
	int m = 0;
	int p = 0;
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
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a == 0 && b == 0)
	{
	p++;
	}
	if (a == 0 && b == 1)
	{
	t++;
	}
	if (a == 0 && b == 2)
	{
	m++;
	}
	if (a == 1 && b == 0)
	{
	m++;
	}
	if (a == 1 && b == 1)
	{
	p++;
	}
	if (a == 1 && b == 2)
	{
	t++;
	}
	if (a == 2 && b == 0)
	{
	t++;
	}
	if (a == 2 && b == 1)
	{
	m++;
	}
	if (a == 2 && b == 2)
	{
	p++;
	}
	}
	if (t > m)
	{
	System.out.print("A");
	}
	else if (t < m)
	{
	System.out.print("B");
	}
	else if (t == m || p == n)
	{
	System.out.print("Tie");
	}
		return 0;
	}
}

