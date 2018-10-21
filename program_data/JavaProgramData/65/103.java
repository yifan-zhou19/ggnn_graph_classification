package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int c;
		int d;
		c = 0;
		d = 0;
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
			else if (a == 0 && b == 2)
			{
				d = d + 1;
			}
			else if (a == 1 && b == 0)
			{
				d = d + 1;
			}
			else if (a == 1 && b == 2)
			{
				c = c + 1;
			}
			else if (a == 2 && b == 0)
			{
				c = c + 1;
			}
			else if (a == 2 && b == 1)
			{
				d = d + 1;
			}
			else
			{
				c = c;
				d = d;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		else if (c < d)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

