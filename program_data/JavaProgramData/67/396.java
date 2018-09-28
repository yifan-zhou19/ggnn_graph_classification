package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float per;
		float per1;
		float a1;
		float b1;
		float a;
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b1 = Float.parseFloat(tempVar3);
		}
		per1 = b1 / a1;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Float.parseFloat(tempVar5);
			}
			per = b / a;
			if (per - per1 > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (per1 - per > 0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

