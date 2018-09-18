package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int f;
	int a;
	int m;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 5;i >= 1;i--)
	{
	f = Math.pow(10,i);
	a = n / f;
	if (a != 0)
	{
		break;
	}
	}
	for (j = 1;j <= i + 1;j++)
	{
	m = n % 10;



	System.out.printf("%d",m);
	n = (n - m) / 10;

	}
	return 0;

	}
}

