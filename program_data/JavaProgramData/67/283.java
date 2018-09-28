package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;

		float c;
		float d;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		c = (float)b / a;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Integer.parseInt(tempVar5);
		}
			d = (float)b / a;
			if (d - c > 0.05F)
			{
				System.out.print("\nbetter");
			}
			else if (c - d > 0.05F)
			{
				System.out.print("\nworse");
			}
			else
			{
				System.out.print("\nsame");
			}

		for (i = 2;i < n;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				b = Integer.parseInt(tempVar7);
			}
			d = (float)b / a;
			if (d - c > 0.05F)
			{
				System.out.print("\nbetter");
			}
			else if (c - d > 0.05F)
			{
				System.out.print("\nworse");
			}
			else
			{
				System.out.print("\nsame");
			}

		}


		return 0;
	}



}

