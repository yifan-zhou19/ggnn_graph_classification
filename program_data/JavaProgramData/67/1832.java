package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xg = new int[999];
		int i;
		float a;
		float b;
		float c;
		float[] z = new float[999];
		float[] y = new float[999];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}

		a = y[0] / z[0];

		for (i = 1;i < n;i++)
		{
			b = y[i] / z[i];
			c = b - a;

			if (c > 0.05F)
			{
				xg[i] = 1;
			}
			if (c <= 0.05F && c >= -0.05F)
			{
				xg[i] = 0;
			}
			if (c < -0.05F)
			{
				xg[i] = -1;
			}
		}

		for (i = 1;i < n;i++)
		{
			if (xg[i] == 1)
			{
				System.out.print("better\n");
			}
			if (xg[i] == 0)
			{
				System.out.print("same\n");
			}
			if (xg[i] == -1)
			{
				System.out.print("worse\n");
			}
		}

		return 0;
	}

}

