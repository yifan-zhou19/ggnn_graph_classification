package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int n;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[10];
		float[] y = new float[10];
		float s = 0F;
		float GPA;
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		 x[i] = a;
		}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
			if (b >= 90)
			{
				y[i] = 4.0F;
			}
			else if (b >= 85)
			{
				y[i] = 3.7F;
			}
				else if (b > 82)
				{
				y[i] = 3.3F;
				}
				else if (b >= 78)
				{
				y[i] = 3.0F;
				}
				else if (b >= 75)
				{
				y[i] = 2.7F;
				}
				else if (b >= 72)
				{
				y[i] = 2.3F;
				}
				else if (b >= 68)
				{
				y[i] = 2.0F;
				}
				else if (b >= 64)
				{
				y[i] = 1.5F;
				}
				else if (b >= 60)
				{
				y[i] = 1.0F;
				}
				else
				{
					y[i] = 0F;
				}
			}
		for (i = 1;i <= n;i++)
		{
			 s = s + y[i] * x[i];
			 p = p + x[i];
		}
	GPA = s / p;
	System.out.printf("%.2f",GPA);
	}
}

