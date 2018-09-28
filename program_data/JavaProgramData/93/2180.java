package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = n % 3;
	if (i == 0)
	{
	System.out.print("3");
	}
	j = n % 5;
	if (j == 0)
	{
	if (i == 0)
	{
	System.out.print(" 5");
	}
	else
	{
	System.out.print("5");
	}
	}

	k = n % 7;
	if (k == 0)
	{
	if (i == 0 || j == 0)
	{
	System.out.print(" 7");
	}
	else
	{
	System.out.print("7");
	}
	}
	if (i != 0 && j != 0 && k != 0)
	{
	System.out.print("n");
	}
	}


}

