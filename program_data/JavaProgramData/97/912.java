package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a1;
	int a2;
	int a3;
	int a4;
	int a5;
	int a6;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n > 1000 || n <= 0)
	{
	System.out.print("error");
	}
	else
	{
	a1 = n / 100;
	a2 = n / 50 - a1 * 2;
	a3 = (n - a1 * 100 - a2 * 50) / 20;
	a4 = (n - a1 * 100 - a2 * 50 - a3 * 20) / 10;
	a5 = (n - a1 * 100 - a2 * 50 - a3 * 20 - a4 * 10) / 5;
	a6 = (n - a1 * 100 - a2 * 50 - a3 * 20 - a4 * 10 - a5 * 5) / 1;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a1,a2,a3,a4,a5,a6);
	}
	return 0;
	}
}

