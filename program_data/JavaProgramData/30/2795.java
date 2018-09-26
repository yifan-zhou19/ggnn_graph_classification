package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int leap = int n;
	int n;
	int sum = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		if (i % 7 != 0 && leap(i) != 0)
		{
			sum = sum + i * i;
		}
	}
	System.out.printf("%d\n",sum);
	return 0;
	}
	public static int leap(int n)
	{
		int a;
		int b;
		int w;
	a = n / 10;
	b = n % 10;
	if (a != 7 && b != 7)
	{
		w = 1;
	}
	if (a == 7 || b == 7)
	{
		w = 0;
	}
	return w;
	}
}

