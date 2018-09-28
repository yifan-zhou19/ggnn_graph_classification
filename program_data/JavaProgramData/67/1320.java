package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		double biao;
		double linshi;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		biao = (double)b / (double)a;
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}
			linshi = (double)d / (double)c;
			if (biao - linshi >= 0.05)
			{
				System.out.print("worse\n");
			}
			  else if (linshi - biao >= 0.05)
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

