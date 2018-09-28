package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m;
		int l;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		float eff = (float)l / (float)m;
		for (int i = 1;i < n;i++)
		{
			int o;
			int p;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				o = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p = Integer.parseInt(tempVar5);
			}
			float exp = (float)p / (float)o;
			if (exp - eff > 0.05F)
			{
			   System.out.print("better\n");
			}
			else
			{
			   if (exp - eff < -0.05F)
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
}

