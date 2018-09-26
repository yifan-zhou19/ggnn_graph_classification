package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int i;
	int m = 0;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a == b)
	{
		m = m;
	}
	else if (b - a == 1 || a - b == 2)
	{
		m = m + 1;
	}
	else
	{
		m = m - 1;
	}
	}
	if (m == 0)
	{
		System.out.print("Tie");
	}
	else if (m > 0)
	{
		System.out.print("A");
	}
	else if (m < 0)
	{
		System.out.print("B");
	}
	return 0;
	}
}

