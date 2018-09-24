package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int x;
	int y;
	int i;
	int j;
	a = 0;
	b = 0;
	i = 0;
	j = 0;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (x - y == 1)
	{
		b++;
	}
	else if (y - x == 1)
	{
		a++;
	}
	else if (x - y == 2)
	{
		a++;
	}
	else if (y - x == 2)
	{
		b++;
	}
	}
	if (a > b)
	{
		System.out.print("A");
	}
	else if (a < b)
	{
		System.out.print("B");
	}
	else if (a = b)
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

