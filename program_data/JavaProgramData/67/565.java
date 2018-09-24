package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float a;
		float b;
		float e;
		float f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		e = b / a;
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
			f = b / a;
			if ((f - e) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((e - f) > 0.05)
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

