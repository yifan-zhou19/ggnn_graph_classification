package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int d = 0;
		if (a < 0)
		{
			System.out.print("-");
			a = -a;
		}
		while (true)
		{
			if (d == 1)
			{
				System.out.printf("%d",a % 10);
			}
			if (a % 10 != 0 && d == 0)
			{
				System.out.printf("%d",a % 10);
				d = 1;
			}

			a = a / 10;
			if (a == 0)
			{
				break;
			}
		}
		return 0;
	}
	public static int Main()
	{
		int a;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			reverse(a);
			if (a == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			1 = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

