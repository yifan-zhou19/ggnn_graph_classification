package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			if (a == 0 && b == 1)
			{
				r += 1;
			}
			else if (a == 1 && b == 2)
			{
				r += 1;
			}
			else if (a == 2 && b == 0)
			{
				r += 1;
			}
			else if (a == b)
			{
				r = r;
			}
			else
			{
				r = r - 1;
			}
		}
		if (r > 0)
		{
			System.out.print("A");
		}
		else if (r < 0)
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

