package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int x;
	int y;
	int z;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a % 3 == 0)
	{
		x = 1;
	}
	else
	{
		x = 0;
	}
	if (a % 5 == 0)
	{
		y = 1;
	}
	else
	{
		y = 0;
	}
	if (a % 7 == 0)
	{
		z = 1;
	}
	else
	{
		z = 0;
	}
	if (x != 1 && y != 1 && z != 1)
	{
		System.out.print("n");
	}
	if (x == 1 && y != 1 && z != 1)
	{
		System.out.print("3");
	}
	if (x != 1 && y == 1 && z != 1)
	{
		System.out.print("5");
	}
	if (x != 1 && y != 1 && z == 1)
	{
		System.out.print("7");
	}
	if (x == 1 && y == 1 && z != 1)
	{
		System.out.print("3 5");
	}
	if (x == 1 && y != 1 && z == 1)
	{
		System.out.print("3 7");
	}
	if (x != 1 && y == 1 && z == 1)
	{
		System.out.print("5 7");
	}
	if (x == 1 && y == 1 && z == 1)
	{
		System.out.print("3 5 7");
	}
	}
}

