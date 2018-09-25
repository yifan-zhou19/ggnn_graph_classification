package <missing>;

public class GlobalMembers
{
	public static double max = 0;
	public static void Main()
	{
		void distance(float x1,float y1,float x2,float y2);
		float[] x = new float[10];
		float[] y = new float[10];
		int n;
		int i;
		int j;
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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				distance(x[i], y[i], x[j], y[j]);
			}
		}
		System.out.printf("%.4lf",Math.sqrt(max));
	}
	public static void distance(float x1,float y1,float x2,float y2)
	{
		double temp;
		temp = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		if (temp > max)
		{
			max = temp;
		}
	}

}

