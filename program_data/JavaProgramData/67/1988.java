package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] z = new float[n - 1];
		float[] yx = new float[n - 1];
		float x;
		float y;
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
				yx[i] = Float.parseFloat(tempVar3);
			}
		}
		x = yx[0] / z[0];
		for (i = 1;i < n;i++)
		{
			y = yx[i] / z[i];
			if (y - x > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (x - y > 0.05F)
			{
				System.out.print("worse\n");
			}
			else if (x - y <= 0.05F && y - x <= 0.05F)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

