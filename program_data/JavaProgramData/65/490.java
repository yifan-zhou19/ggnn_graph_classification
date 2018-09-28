package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c = 0;
	int d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n-- != 0)
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
	if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
	{
		c++;
	}
	if (a == b)
	{
		c++;
	d++;
	}
	if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
	{
		d++;
	}
	}
	if (c > d)
	{
		System.out.print("A");
	}
	if (c < d)
	{
		System.out.print("B");
	}
	if (c == d)
	{
		System.out.print("Tie");
	}
		return 0;
	}

}

