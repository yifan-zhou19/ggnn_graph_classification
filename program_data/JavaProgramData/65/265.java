package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c = 0;
		int d = 0;
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
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a == 0 && b == 1)
		{
			c = c + 1;
		}
		if (a == 1 && b == 2)
		{
			c = c + 1;
		}
		if (a == 2 && b == 0)
		{
			c = c + 1;
		}
		if (a == 1 && b == 0)
		{
			d = d + 1;
		}
		if (b == 1 && a == 2)
		{
			d = d + 1;
		}
		if (b == 2 && a == 0)
		{
			d = d + 1;
		}
		}
			if (c == d)
			{
				System.out.print("Tie\n");
			}
			if (c > d)
			{
				System.out.print("A\n");
			}
			if (c < d)
			{
				System.out.print("B\n");
			}
			return 0;
	}

}

