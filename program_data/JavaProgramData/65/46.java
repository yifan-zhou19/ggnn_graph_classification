package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			if (a == b)
			{
				c = c;
			}
			else if (a - b == 1)
			{
				c = c - 1;
			}
			else if (b - a == 1)
			{
				c += 1;
			}
			else if (a - b == 2)
			{
				c += 1;
			}
			else if (b - a == 2)
			{
				c = c - 1;
			}
		}
		if (c > 0)
		{
			System.out.print("A");
		}
		else if (c < 0)
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

