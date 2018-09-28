package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num1;
		int num2;
		int compare1;
		int compare2;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num2 = Integer.parseInt(tempVar3);
		}
		x = (double)num2 / num1;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				compare1 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				compare2 = Integer.parseInt(tempVar5);
			}
			y = (double)compare2 / compare1;
			if (x > y && x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			else if (x < y && y - x>0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

