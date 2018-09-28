package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
	if (k % 3 == 0 && k % 5 == 0 && k % 7 == 0)
	{
	System.out.print("3 5 7");
	}
	else if (k % 3 == 0 && k % 5 == 0)
	{
	System.out.print("3 5");
	}
	else if (k % 3 == 0 && k % 7 == 0)
	{
	System.out.print("3 7");
	}
	else if (k % 5 == 0 && k % 7 == 0)
	{
	System.out.print("5 7");
	}
	else if (k % 3 == 0)
	{
	System.out.print("3");
	}
	else if (k % 5 == 0)
	{
	System.out.print("5");
	}
	else if (k % 7 == 0)
	{
	System.out.print("7");
	}
	else
	{
	System.out.print("n");
	}
	}

}

