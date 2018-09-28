package <missing>;

public class GlobalMembers
{
	public static void f1(int a)
	{
		int b;
		if (a >= 100)
		{
			b = a / 100;
			System.out.printf("%d\n",b);
			a = a - b * 100;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 50)
		{
			System.out.print("1\n");
			a = a - 50;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 20)
		{
			b = a / 20;
			System.out.printf("%d\n",b);
			a = a - b * 20;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 10)
		{
			System.out.print("1\n");
			a = a - 10;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 5)
		{
			System.out.print("1\n");
			a = a - 5;
		}
		else
		{
			System.out.print("0\n");
		}
		System.out.printf("%d",a);
	}
	public static void Main()
	{
		int RMB;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			RMB = Integer.parseInt(tempVar);
		}
		f1(RMB);
	}
}

