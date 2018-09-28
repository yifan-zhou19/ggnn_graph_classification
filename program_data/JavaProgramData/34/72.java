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
	b = a % 2;

	if (b == 0)
	{
	while (b == 0)
	{
	c = a / 2;
	b = c % 2;
	System.out.printf("%d/2=%d\n",a,c);
	a = c;
	}
	if (a == 1)
	{
	System.out.print("End");
	}
	else
	{
	while ((b != 0) && (a != 1))
	{

	d = a * 3 + 1;
	System.out.printf("%d*3+1=%d\n",a,d);
	a = d;
	b = a % 2;
	while (b == 0)
	{
	c = a / 2;
	b = c % 2;
	System.out.printf("%d/2=%d\n",a,c);
	a = c;
	}

	}

	System.out.print("End");
	}
	}


	else
	{
	if (a == 1)
	{
	System.out.print("End");
	}
	else
	{
	while ((b != 0) && (a != 1))
	{

	d = a * 3 + 1;
	System.out.printf("%d*3+1=%d\n",a,d);
	a = d;
	b = a % 2;
	while (b == 0)
	{
	c = a / 2;
	b = c % 2;
	System.out.printf("%d/2=%d\n",a,c);
	a = c;
	}

	}

	System.out.print("End");
	}

	}
	}

}

