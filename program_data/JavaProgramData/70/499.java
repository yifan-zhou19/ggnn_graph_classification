package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		double f = new double(float x,float y,float z,float w);
		int i;
		int j;
		int n;
		double d = 0.0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (f(a[i], a[j], b[i], b[j]) > d)
				{
					d = f(a[i], a[j], b[i], b[j]);
				}
			}
		}
		d = (float)d;
		System.out.printf("%.4f\n",d);
	}
	public static double f(float x,float y,float z,float w)
	{
		double s;
		s = Math.sqrt((x - y) * (x - y) + (z - w) * (z - w));
		return (s);
	}

}

