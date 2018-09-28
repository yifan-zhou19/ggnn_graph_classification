package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int x = 0;
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
			if (a == 0)
			{
				if (b == 1)
				{
					x += 1;
				}
				else if (b == 2)
				{
					x -= 1;
				}
			}
			else if (a == 1)
			{
				if (b == 0)
				{
					x -= 1;
				}
				else if (b == 2)
				{
					x += 1;
				}
			}
			else
			{
				if (b == 0)
				{
					x += 1;
				}
				if (b == 1)
				{
					x -= 1;
				}
			}
		}
		if (x > 0)
		{
			System.out.print("A");
		}
		else if (x == 0)
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

