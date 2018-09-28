package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		float std;
		float improve;
		int total;
		int ok;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			total = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ok = Integer.parseInt(tempVar3);
		}
		std = (float)ok / (float)total;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				total = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				ok = Integer.parseInt(tempVar5);
			}
			improve = (float)ok / (float)total;
			if (improve - std > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (std - improve > 0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
	}


}

