package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int e;
		int f;
		int d;
		int h;
		int k;
		int m;
		int n;
		float[] x = new float[1000];
		float[] y = new float[1000];
		float a;
		float b;
		float c;
		String z = new String(new char[1000]);
		d = 0;
		a = 0F;
		b = 0F;
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Float.parseFloat(tempVar2);
		}
		a += x[i];
		}
		i = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		if (y[i] <= 59F)
		{
			y[i] = 0F;
		}
		if (y[i] >= 90F)
		{
			y[i] = 4.0F;
		}
		if (y[i] <= 89F && y[i] >= 85F)
		{
			y[i] = 3.7F;
		}
		if (y[i] <= 84F && y[i] >= 82F)
		{
			y[i] = 3.3F;
		}
		if (y[i] <= 81F && y[i] >= 78F)
		{
			y[i] = 3.0F;
		}
		if (y[i] <= 77F && y[i] >= 75F)
		{
			y[i] = 2.7F;
		}
		if (y[i] <= 74F && y[i] >= 72F)
		{
			y[i] = 2.3F;
		}
		if (y[i] <= 71F && y[i] >= 68F)
		{
			y[i] = 2.0F;
		}
		if (y[i] <= 67F && y[i] >= 64F)
		{
			y[i] = 1.5F;
		}
		if (y[i] <= 63F && y[i] >= 60F)
		{
			y[i] = 1.0F;
		}
		b += x[i] * y[i];
		}
		c = b / a;
		System.out.printf("%.2f",c);
		return 0;
	}

}

