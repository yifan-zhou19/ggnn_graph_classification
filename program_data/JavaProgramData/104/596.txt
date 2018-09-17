package <missing>;

public class GlobalMembers
{
	public static int erchashu(int a,int b)
	{
		if (a == b)
		{
			return (a);
		}
		if (a > b)
		{
			return (erchashu(a / 2, b));
		}
		if (a < b)
		{
			return (erchashu(a, b / 2));
		}
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
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
		c = erchashu(a, b);
		System.out.printf("%d",c);
	}
}

