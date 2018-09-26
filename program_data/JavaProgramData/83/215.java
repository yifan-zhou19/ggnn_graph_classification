package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[9];
		int[] b = new int[9];
		float[] c = new float[9];
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
		float f = new float(int a,int b);
		for (i = 0;i < n;i++)
		{
			c[i] = f(a[i], b[i]);
		}
		float sum1 = 0F;
		int sum2 = 0;
		for (i = 0;i < n;i++)
		{
			sum1 += c[i];
			sum2 += a[i];
		}
		float GPA;
		GPA = sum1 / sum2;
		System.out.printf("%.2f\n",GPA);
	}
	public static float f(int a,int b)
	{
		float c;
		if (b >= 90 && b <= 100)
		{
			c = 4.0F;
		}
		else if (b >= 85 && b <= 89)
		{
			c = 3.7F;
		}
		else if (b >= 82 && b <= 84)
		{
			c = 3.3F;
		}
		else if (b >= 78 && b <= 81)
		{
			c = 3.0F;
		}
		else if (b >= 75 && b <= 77)
		{
			c = 2.7F;
		}
		else if (b >= 72 && b <= 74)
		{
			c = 2.3F;
		}
		else if (b >= 68 && b <= 71)
		{
			c = 2.0F;
		}
		else if (b >= 64 && b <= 67)
		{
			c = 1.5F;
		}
		else if (b >= 60 && b <= 63)
		{
			c = 1.0F;
		}
		else
		{
			c = 0F;
		}
		return (c * a);
	}
}

