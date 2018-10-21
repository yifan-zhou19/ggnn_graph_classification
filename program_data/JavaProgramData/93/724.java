package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	if (x % 105 == 0)
	{
	System.out.print("3 5 7");
	}
	if (x % 105 != 0)
	{
	if (x % 21 == 0)
	{
	System.out.print("3 7");
	}
	if (x % 15 == 0)
	{
	System.out.print("3 5");
	}
	if (x % 35 == 0)
	{
	System.out.print("5 7");
	}
	}
	if (x % 21 != 0 && x % 15 != 0 && x % 35 != 0)
	{
	if (x % 3 == 0)
	{
	System.out.print("3");
	}
	if (x % 5 == 0)
	{
	System.out.print("5");
	}
	if (x % 7 == 0)
	{
	System.out.print("7");
	}
	}
	if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
	{
	System.out.print("n");
	}
	return 0;
	}


}

