package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	while (a != 1)
	{
	if (a % 2 == 0)
	{
	b = a / 2;
	System.out.printf("%d/2=%d\n",a,b);
	a = b;
	}
	else
	{
		b = 3 * a + 1;
	System.out.printf("%d*3+1=%d\n",a,b);
	a = b;
	}
	}
	System.out.print("End");
	System.in.read();
	System.in.read();
	}
}

