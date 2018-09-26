package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xf = new int[10];
		float[] sz = new float[10];
		int i;
		int e;
		int n;
		float c = 0F;
		float GPA = 0F;
		e = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
			e += xf[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Float.parseFloat(tempVar3);
			}
			if (sz[i] >= 90F)
			{
				sz[i] = 4.0F;
			}
			else if (sz[i] >= 85F)
			{
				sz[i] = 3.7F;
			}
			else if (sz[i] >= 82F)
			{
				sz[i] = 3.3F;
			}
			else if (sz[i] >= 78F)
			{
				sz[i] = 3.0F;
			}
			else if (sz[i] >= 75F)
			{
				sz[i] = 2.7F;
			}
			else if (sz[i] >= 72F)
			{
				sz[i] = 2.3F;
			}
			else if (sz[i] >= 68F)
			{
				sz[i] = 2.0F;
			}
			else if (sz[i] >= 64F)
			{
				sz[i] = 1.5F;
			}
			else if (sz[i] >= 60F)
			{
				sz[i] = 1.0F;
			}
			else
			{
				sz[i] = 0F;
			}
		}
			for (i = 0;i <= n - 1;i++)
			{
				c += sz[i] * xf[i];
			}
			GPA = c * 1.0 / e;
	System.out.printf("%.2f",GPA);
	return 0;
	}

}

