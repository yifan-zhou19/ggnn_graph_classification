package <missing>;

public class GlobalMembers
{
	public static int print(int n)
	{
		int s;
		int a;
		int b;
		a = n;
		s = 0;
		if (a == 0)
		{
			System.out.print("0");
		}
		else
		{
		while (a > 0)
		{
			b = a % 10;
			System.out.printf("%d",b);
			a = a / 10;
		}
		}
	return 0;
	}
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	print(n);
	return 0;
	}

}

