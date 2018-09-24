package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int b = 0;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (a != 0)
	{
	while (a != 0)
	{
	   b = a % 10;
	   System.out.print(b);
	   a = a / 10;
	}
	}
	else
	{
		System.out.print(0);
	}


	}
}

