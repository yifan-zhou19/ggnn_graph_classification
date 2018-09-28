package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		c = 0;
		d = 0;
		while (i <= n)
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
			if (a == b)
			{
				i++;
			}
			else if (a == 0 && b == 1)
			{
				c = c + 1;
				i++;
			}
			else if (a == 0 && b == 2)
			{
				d = d + 1;
				i++;
			}
			else if (a == 1 && b == 0)
			{
				d = d + 1;
				i++;
			}
			else if (a == 1 && b == 2)
			{
				c = c + 1;
				i++;
			}
			else if (a == 2 && b == 0)
			{
				c = c + 1;
				i++;
			}
			else
			{
				d = d + 1;
			i++;
			}
		}
		if (c > d)
		{
			System.out.print("A\n");
		}
		else if (c == d)
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

