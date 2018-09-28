package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int a;
	int b;
	int c = 0;
	int d = 0;
	double s;
	double t;
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
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
	{
		c = c + 1;
	}
	if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
	{
		d = d + 1;
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

