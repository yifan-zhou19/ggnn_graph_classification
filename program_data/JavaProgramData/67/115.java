package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a1;
		float g1;
		float r1;
		float[] a = new float[1000];
		float[] g = new float[1000];
		float[] r = new float[1000];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n = n - 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			g1 = Float.parseFloat(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				g[i] = Float.parseFloat(tempVar5);
			}
		}
		r1 = g1 / a1;
		for (i = 0;i < n;i++)
		{
			r[i] = g[i] / a[i];
			if ((r[i] - r1) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((r[i] - r1) < (-0.05))
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

