package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	if (n == 1 || n == 2)
	{
	return 1;
	}
	else
	{
	return f(n - 1) + f(n - 2);
	}
	}
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (scanf("%d", n) != EOF)
	{
	System.out.printf("%d\n",f(n));
	}
	}

}

