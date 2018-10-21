package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] x = new float[100];
		float[] y = new float[100];
		float[] z = new float[100];
		float[] m = new float[100];
		float GPA;
		float a = 0F;
		float b = 0F;
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
				y[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Float.parseFloat(tempVar3);
			}
			if (x[i] <= 100F && x[i] >= 90F)
			{
				m[i] = 4.0F;
			}
			if (x[i] <= 89F && x[i] >= 85F)
			{
				m[i] = 3.7F;
			}
			if (x[i] <= 84F && x[i] >= 82F)
			{
				m[i] = 3.3F;
			}
			if (x[i] <= 81F && x[i] >= 78F)
			{
				m[i] = 3.0F;
			}
			if (x[i] <= 77F && x[i] >= 75F)
			{
				m[i] = 2.7F;
			}
			if (x[i] <= 74F && x[i] >= 72F)
			{
				m[i] = 2.3F;
			}

			if (x[i] <= 71F && x[i] >= 68F)
			{
				m[i] = 2.0F;
			}

			 if (x[i] <= 67F && x[i] >= 64F)
			 {
				m[i] = 1.5F;
			 }
			if (x[i] <= 63F && x[i] >= 60F)
			{
				m[i] = 1.0F;
			}
			if (x[i] < 60F)
			{
				m[i] = 0.0F;
			}
		}

		for (i = 0;i < n;i++)
		{
			z[i] = y[i] * m[i];
			a = a + z[i];
			b = b + y[i];
		}
		GPA = a / b;
		System.out.printf("%.2f",GPA);

		return 0;
	}

}

