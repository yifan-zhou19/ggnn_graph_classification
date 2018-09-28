package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int a;
		int b;
		int i;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = 0;
		for (i = 0;i < n;i++)
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
			if (a == 2 && b == 0)
			{
				x = x + 1;
			}
			else if (a == 0 && b == 2)
			{
				x = x;
			}
			else if (a < b)
			{
				x = x + 1;
			}
			else if (a == b)
			{
				y = y + 1;
			}
		}
		z = 1.0 * (n - y) / 2;
		if (x > z)
		{
			System.out.print("A");
		}
		else if (x == z)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}

