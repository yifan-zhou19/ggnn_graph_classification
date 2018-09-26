package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int g = 0;
		int i;
		int n;
		float GPA;
		float[] c = new float[11];
		float f = 0F;
		float[] d = new float[11];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				c[i] = 4.0F;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7F;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3F;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0F;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7F;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3F;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0F;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5F;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0F;
			}
			else
			{
				c[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = c[i] * a[i];
			f = f + d[i];
			g = g + a[i];
		}
		GPA = (float)f / g;
		System.out.printf("%.2f\n",GPA);
	}

}

