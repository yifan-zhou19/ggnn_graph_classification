package <missing>;

public class GlobalMembers
{
	public static float score(float x)
	{
		if (x < 60F)
		{
		  return 0F;
		}
		else if (x <= 63F)
		{
		  return 1.0F;
		}
		else if (x <= 67F)
		{
		  return 1.5F;
		}
		else if (x <= 71F)
		{
		  return 2.0F;
		}
		else if (x <= 74F)
		{
		  return 2.3F;
		}
		else if (x <= 77F)
		{
		  return 2.7F;
		}
		else if (x <= 81F)
		{
		  return 3F;
		}
		else if (x <= 84F)
		{
		  return 3.3F;
		}
		else if (x <= 89F)
		{
		  return 3.7F;
		}
		else
		{
		  return 4.0F;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		float sum = 0F;
		float GAP = 0F;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] c = new float[10];
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
			sum += (float)a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			c[i] = score(b[i]);
			GAP += a[i] * c[i];
		}
		GAP /= sum;
		System.out.printf("%.2f\n",GAP);
		return 0;
	}

}

