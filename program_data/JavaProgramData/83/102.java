package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int h;
		int[] a = new int[10];
		int[] c = new int[10];
		int y;
		float[] b = new float[10];
		float sum = 0F;
		float GPA;
		float p = 0F;
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
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < n;k++)
		{
			if (a[k] >= 90 && a[k] <= 100)
			{
				b[k] = 4.0F;
			}
			else if (a[k] >= 85 && a[k] <= 89)
			{
				b[k] = 3.7F;
			}
			else if (a[k] >= 82 && a[k] <= 84)
			{
				b[k] = 3.3F;
			}
			else if (a[k] >= 78 && a[k] <= 81)
			{
				b[k] = 3.0F;
			}
			else if (a[k] >= 75 && a[k] <= 77)
			{
				b[k] = 2.7F;
			}
			else if (a[k] >= 72 && a[k] <= 74)
			{
				b[k] = 2.3F;
			}
			else if (a[k] >= 68 && a[k] <= 71)
			{
				b[k] = 2.0F;
			}
			else if (a[k] >= 64 && a[k] <= 67)
			{
				b[k] = 1.5F;
			}
			else if (a[k] >= 60 && a[k] <= 63)
			{
				b[k] = 1.0F;
			}
			else
			{
				b[k] = 0F;
			}
		}
		for (h = 0;h < n;h++)
		{
			sum = sum + b[h] * c[h];
		}
		for (y = 0;y < n;y++)
		{
			p += c[y];
		}
		GPA = sum / p;
		System.out.printf("%.2f",GPA);
	}


}

