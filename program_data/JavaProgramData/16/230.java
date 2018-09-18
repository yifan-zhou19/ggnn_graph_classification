package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	if (n == 0)
	{
		System.out.printf("%d\n",n);
	}
	else
	{
	for (;n > 0;)
	{
		  a = n % 10;
	   System.out.printf("%d",a);
	   n = n / 10;
	}
	}
	System.out.print("\n");
	return 0;
	}
}

