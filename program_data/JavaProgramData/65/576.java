package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int x;
		int y;
		int z = 0;


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
		for (y = 0;y < x;y++)
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
	if (a == 0 && b == 1)
	{
		z = z + 1;
	}
	if (a == 1 && b == 2)
	{
		z = z + 1;
	}
	if (a == 2 && b == 0)
	{
		z = z + 1;
	}
	if (b == 0 && a == 1)
	{
		z = z - 1;
	}
	if (b == 1 && a == 2)
	{
		z = z - 1;
	}
	if (b == 2 && a == 0)
	{
		z = z - 1;
	}
		}

	if (z > 0)
	{
		System.out.print("A");
	}
	if (z < 0)
	{
		System.out.print("B");
	}
	if (z == 0)
	{
		System.out.print("Tie");
	}
	return 0;

	}
}

