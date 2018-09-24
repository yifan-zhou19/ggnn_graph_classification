package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int n;
	int x;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 0;a <= 9;a++)
	{
	if (a == 7)
	{
		continue;
	}
	for (b = 0;b <= 9;b++)
	{
	if (b == 7)
	{
		continue;
	}
	x = a * 10 + b;
	if (x % 7 == 0)
	{
		continue;
	}
	if (x > n)
	{
		break;
	}
	sum += x * x;
	}
	}
	System.out.printf("%d\n",sum);
	return 0;
	}
}

