package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	r = a % 10;
	do
	{
	System.out.printf("%d",r);
	a = a - r;
	a = a / 10;
	r = a % 10;
	} while (a >= 1);
	return 0;
	}
}

