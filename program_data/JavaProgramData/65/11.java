package <missing>;

public class GlobalMembers
{
	public static int panduan(int a,int b)
	{
		if (a == b)
		{
			return 0;
		}
		else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int b;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			x += panduan(a, b);
		}

		if (x > 0)
		{
			System.out.print("A\n");
		}
		else if (x == 0)
		{
			System.out.print("Tie\n");
		}
		else
		{
			System.out.print("B\n");
		}

		return 0;
	}
}

