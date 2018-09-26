package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		float s = 0F;
		float m = 0F;
		float gpa;
		float[] a = new float[10];
		int[] b = new int[10];
		float[] c = new float[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			if (b[j] <= 100 && b[j] >= 90)
			{
				c[j] = 4.0F;
			}
			if (b[j] >= 85 && b[j] <= 89)
			{
				c[j] = 3.7F;
			}
			if (b[j] >= 82 && b[j] <= 84)
			{
				c[j] = 3.3F;
			}
			if (b[j] >= 78 && b[j] <= 81)
			{
				c[j] = 3.0F;
			}
			if (b[j] >= 75 && b[j] <= 77)
			{
				c[j] = 2.7F;
			}
			if (b[j] >= 72 && b[j] <= 74)
			{
				c[j] = 2.3F;
			}
			if (b[j] >= 68 && b[j] <= 71)
			{
				c[j] = 2.0F;
			}
			if (b[j] >= 64 && b[j] <= 67)
			{
				c[j] = 1.5F;
			}
			if (b[j] >= 60 && b[j] <= 63)
			{
				c[j] = 1.0F;
			}
			if (b[j] < 60)
			{
				c[j] = 0F;
			}
		}
		for (k = 0;k < n;k++)
		{
			s = s + a[k] * c[k];
		}
		for (k = 0;k < n;k++)
		{
			m = m + a[k];
		}
		gpa = s / m;
		System.out.printf("%.2f",gpa);
		return 0;
	}
}

