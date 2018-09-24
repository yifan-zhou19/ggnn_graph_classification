package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (c == d)
			{
				continue;
			}
			else if (c == 0 && d == 2)
			{
				b++;
			}
			else if (c == 2 && d == 0)
			{
				a++;
			}
			else if (c - d < 0)
			{
				a++;
			}
			else if (c - d > 0)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}
}

