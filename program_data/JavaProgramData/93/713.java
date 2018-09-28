package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a % 105 == 0)
	{
	System.out.printf("%d %d %d",3,5,7);
	}
	else if (a % 15 == 0)
	{
	System.out.printf("%d %d",3,5);
	}
	else if (a % 21 == 0)
	{
	System.out.printf("%d %d",3,7);
	}
	else if (a % 35 == 0)
	{
	System.out.printf("%d %d",5,7);
	}
	else if (a % 3 == 0)
	{
	System.out.printf("%d",3);
	}
	else if (a % 5 == 0)
	{
	System.out.printf("%d",5);
	}
	else if (a % 7 == 0)
	{
	System.out.printf("%d",7);
	}
	else
	{
	System.out.printf("%c",'n');
	}
	return 0;
	}
}

