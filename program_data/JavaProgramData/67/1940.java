package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		float xa;
		float xb;
		float xc;
		float[] ya = new float[1000];
		float[] yb = new float[1000];
		float[] yc = new float[1000];
		float[] yd = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xa = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			xb = Float.parseFloat(tempVar3);
		}
		xc = xb / xa;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ya[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				yb[i] = Float.parseFloat(tempVar5);
			}
			yc[i] = yb[i] / ya[i];
		}
		for (i = 1;i < n;i++)
		{
			yd[i] = yc[i] - xc;
			if (yd[i] > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (yd[i] < -0.05F)
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

