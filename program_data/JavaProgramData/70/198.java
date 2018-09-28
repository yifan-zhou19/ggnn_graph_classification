package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] p;
		double[] j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		p = new double[k];
		j = new double[k];
		int i;
		for (i = 0;i < k;i++)
		{
			float x;
			float y;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Float.parseFloat(tempVar3);
			}
			p[i] = x;
			j[i] = y;

		}
		double l;
		l = Math.sqrt((p[0] - p[0]) * (p[0] - p[0]) + (j[0] - j[0]) * (j[0] - j[0]));
		int m;
		int n;
		double g;
		for (m = 0;m < k;m++)
		{
			for (n = 0;n < k;n++)
			{
			g = Math.sqrt((p[m] - p[n]) * (p[m] - p[n]) + (j[m] - j[n]) * (j[m] - j[n]));
			if (g > l)
			{
				l = g;
			}
			else
			{
				l = l;
			}
			}
		}
		System.out.printf("%.4f\n",l);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(j);
	}


}

