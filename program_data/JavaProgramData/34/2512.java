package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n != 1)
	{
	if (n % 2 == 1)
	{
	System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n = n * 3 + 1);
	}
	else
	{
	System.out.printf("%d/2=%d\n",n * 2,n = n / 2);
	}
	}
	System.out.print("End");
	}

}

