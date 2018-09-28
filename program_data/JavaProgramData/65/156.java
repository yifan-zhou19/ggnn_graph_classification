package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int x;
	int y;
	int f = 0;
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
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (x - y == 1)
	{
	f = f - 1;
	}
	else if (y - x == 1)
	{
	f = f + 1;
	}
	else if (x - y == 2)
	{
	f = f + 1;
	}
	else if (y - x == 2)
	{
	f = f - 1;
	}
	}
	if (f > 0)
	{
	System.out.print("A");
	}
	else if (f < 0)
	{
	System.out.print("B");
	}
	else if (f == 0)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

