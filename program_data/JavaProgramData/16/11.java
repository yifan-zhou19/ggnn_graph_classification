package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int n;
	int s;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a == 0)
	{
		System.out.print("0");
	}
	n = 0;
	b = a;
	while (b != 0)
	{
	 b = (b / 10);
	 n = n + 1;
	}
	n = n - 1;
	for (i = 0;i <= n;i++)
	{
	 b = a % 10;
	 a = a / 10;
	 System.out.printf("%d",b);
	}
	}
}

