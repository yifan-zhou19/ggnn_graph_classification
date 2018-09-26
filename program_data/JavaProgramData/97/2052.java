package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;n >= 100;i++)
	{
		n = n - 100;
	}
	  System.out.printf("%d\n",i);
	for (i = 0;n >= 50;i++)
	{
		n = n - 50;
	}
	  System.out.printf("%d\n",i);
	for (i = 0;n >= 20;i++)
	{
		n = n - 20;
	}
	  System.out.printf("%d\n",i);
	for (i = 0;n >= 10;i++)
	{
		n = n - 10;
	}
	  System.out.printf("%d\n",i);
	for (i = 0;n >= 5;i++)
	{
		n = n - 5;
	}
	  System.out.printf("%d\n",i);
	  System.out.printf("%d\n",n);

	return 0;
	}
}

