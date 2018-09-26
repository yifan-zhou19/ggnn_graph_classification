package <missing>;

public class GlobalMembers
{
	public static int oper;
	public static void p(int n)
	{
		if (oper != 0)
		{
			System.out.print(" ");
		}
		System.out.printf("%d", n);
		oper = 1;
	}
	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		oper = 0;

		if (num % 3 == 0)
		{
			p(3);
		}
		if (num % 5 == 0)
		{
			p(5);
		}
		if (num % 7 == 0)
		{
			p(7);
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

