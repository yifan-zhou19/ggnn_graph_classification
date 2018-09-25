package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int c;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 0)
	{
		System.out.print("0");
	}
	for (i = 1;i <= n;)
	{
		i = i * 10;
		c = n % i;
		n = n - c;
		b = c * 10 / i;
		System.out.printf("%d",b);
	}
	System.out.print("\n");
	}

}

