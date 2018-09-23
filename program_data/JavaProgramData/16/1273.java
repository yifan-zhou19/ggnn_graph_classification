package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a == 10000)
	{
	System.out.print("00001");
	}
	else
	{
	if (a >= 1000)
	{
		b = a % 10;
	a = (a - b) / 10;
	c = a % 10;
	a = (a - c) / 10;
	d = a % 10;
	a = (a - d) / 10;
	System.out.printf("%d%d%d%d",b,c,d,a);
	}
	else
	{
		if (a >= 100)
		{
			b = a % 10;
	a = (a - b) / 10;
	c = a % 10;
	a = (a - c) / 10;
	System.out.printf("%d%d%d",b,c,a);
		}
		else
		{
		  if (a >= 10)
		  {
			  b = a % 10;
	a = (a - b) / 10;
	System.out.printf("%d%d",b,a);
		  }
	else
	{
	System.out.printf("%d",a);
	}
		}
	}
	}
	return 0;
	}

}

