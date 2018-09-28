package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int n;
	int c = 0;
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
	if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0)
	{
		c = c + 1;
	}
	else if (a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b == 1)
	{
		c = c - 1;
	}
	}
	if (c == 0)
	{
		System.out.print("Tie");
	}
	else if (c > 0)
	{
		System.out.print("A");
	}
	else if (c < 0)
	{
		System.out.print("B");
	}
	return 0;
	}


}

