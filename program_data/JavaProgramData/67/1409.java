package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float[] a = new float[10000];
		float[] b = new float[10000];
		float[] p = new float[10000];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			p[i] = b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (p[i] - p[0] >= -0.05F && p[i] - p[0] <= 0.05F)
			{
				System.out.print("same\n");
			}
			if (p[i] - p[0] > 0.05F)
			{
				System.out.print("better\n");
			}
			if (p[i] - p[0] < -0.05F)
			{
				System.out.print("worse\n");
			}
		}
	}

}

