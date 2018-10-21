package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int m = 0;
		 int n;
		 int[] a = new int[11];
		 int[] b = new int[11];
		float GPA = 0F;
		float[] c = new float[11];
		float[] d = new float[11];
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= n;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		for (i = 1;i <= n;i++)
		{
			 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i] >= 90 && b[i] < 101)
			{
				c[i] = 4.0F;
			}
			if (b[i] >= 85 && b[i] < 90)
			{
				c[i] = 3.7F;
			}
			if (b[i] >= 82 && b[i] < 85)
			{
				c[i] = 3.3F;
			}
			if (b[i] >= 78 && b[i] < 82)
			{
				c[i] = 3.0F;
			}
			if (b[i] >= 75 && b[i] < 78)
			{
				c[i] = 2.7F;
			}
			if (b[i] >= 72 && b[i] < 75)
			{
				c[i] = 2.3F;
			}
			if (b[i] >= 68 && b[i] < 72)
			{
				c[i] = 2.0F;
			}
			if (b[i] >= 64 && b[i] < 68)
			{
				c[i] = 1.5F;
			}
			if (b[i] >= 60 && b[i] < 64)
			{
				c[i] = 1.0F;
			}
			if (b[i] >= 0 && b[i] < 60)
			{
				c[i] = 0.0F;
			}
		}
		for (i = 1;i <= n;i++)
		{
		 d[i] = a[i] * c[i];
		 GPA += d[i];
		 m = m + a[i];
		}
		System.out.printf("%.2f",GPA / m);

	}

}

