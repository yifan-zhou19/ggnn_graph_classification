package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	char n;
	n = 'n';
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
	{
		System.out.print("3 5 7");
	}
	else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
	{
		System.out.print("5 7");
	}
	else if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
	{
		System.out.print("3 7");
	}
	else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
	{
		System.out.print("3 5");
	}
	else if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
	{
		System.out.print("3");
	}
	else if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
	{
		System.out.print("5");
	}
	else if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
	{
		System.out.print("7");
	}
	else if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
	{
		System.out.printf("%c",n);
	}
	return 0;
	}

}

