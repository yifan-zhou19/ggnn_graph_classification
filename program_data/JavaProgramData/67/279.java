package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float k;
		float p;
		float q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Float.parseFloat(tempVar3);
		}
		k = q / p;
		for (i = 0;i < n - 1;i++)
		{
			float a;
			float b;
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
			if (b / a - k > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (k - b / a > 0.05F)
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

