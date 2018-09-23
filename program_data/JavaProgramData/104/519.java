package <missing>;

public class GlobalMembers
{
	public static int div(int a)
	{
		if (a % 2 == 1)
		{
			a = (a - 1) / 2;
		}
		else
		{
			a = a / 2;
		}
		return a;
	}
	public static int compare(int a, int b)
	{
		if (a > b)
		{
			a = div(a);
			compare(a, b);
		}
		else if (a < b)
		{
			b = div(b);
			compare(a, b);
		}
		else
		{
			return (a);
		}
	}
	public static void Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a = compare(a, b);
		System.out.printf("%d",a);
	}
}

