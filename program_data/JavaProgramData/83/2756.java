package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float j = int y;
		float gpa = 0F;
		float xf = 0F;
		float[] g = new float[10];
		float[] x = new float[10];
		float[] jd = new float[10];
		int n;
		int i;
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
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Float.parseFloat(tempVar3);
			}
			jd[i] = j(g[i]);
		}
		for (i = 0;i < n;i++)
		{
			gpa = gpa + jd[i] * x[i];
			xf = xf + x[i];
		}
		gpa = gpa / xf;
		System.out.printf("%.2f\n",gpa);
		return 0;
	}

	public static float j(int y)
	{
		float z;
		if (y > 89)
		{
			z = 4.0F;
		}
		else if (y > 84)
		{
			z = 3.7F;
		}
		else if (y > 81)
		{
			z = 3.3F;
		}
		else if (y > 77)
		{
			z = 3.0F;
		}
		else if (y > 74)
		{
			z = 2.7F;
		}
		else if (y > 71)
		{
			z = 2.3F;
		}
		else if (y > 67)
		{
			z = 2.0F;
		}
		else if (y > 63)
		{
			z = 1.5F;
		}
		else if (y > 59)
		{
			z = 1.0F;
		}
		else
		{
			z = 0F;
		}
		return (z);
	}
}

