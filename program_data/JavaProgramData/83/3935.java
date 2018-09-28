package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d;
		int[] g01 = new int[10];
		float[] g02 = new float[10];
		float GPA = 0F;
		float e = 0F;
		float sum01 = 0F;
		float sum02 = 0F;

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
				g01[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (d >= 90 && d <= 100)
			{
				e = 4.0F;
			}
			if (d >= 85 && d <= 89)
			{
				e = 3.7F;
			}
			if (d >= 82 && d <= 84)
			{
				e = 3.3F;
			}
			if (d >= 78 && d <= 81)
			{
				e = 3.0F;
			}
			if (d >= 75 && d <= 77)
			{
				e = 2.7F;
			}
			if (d >= 72 && d <= 74)
			{
				e = 2.3F;
			}
			if (d >= 68 && d <= 71)
			{
				e = 2.0F;
			}
			if (d >= 64 && d <= 67)
			{
				e = 1.5F;
			}
			if (d >= 60 && d <= 63)
			{
				e = 1F;
			}
			if (d <= 60)
			{
				e = 0F;
			}
			g02[j] = e * g01[j];
		}
		for (i = 0;i < n;i++)
		{
			sum01 = sum01 + g02[i];
			sum02 = sum02 + g01[i];
		}
		GPA = sum01 / sum02;
		System.out.printf("%.2f",GPA);
	}
}

