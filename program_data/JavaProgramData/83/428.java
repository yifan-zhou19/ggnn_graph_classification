package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[10];
		int sum1 = 0;
		float[] b = new float[10];
		float sum2 = 0F;
		float GPA;
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
			sum1 += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			if (b[i] >= 90F && b[i] <= 100F)
			{
				b[i] = 4.0F;
			}
			else if (b[i] >= 85F && b[i] <= 89F)
			{
				b[i] = 3.7F;
			}
			else if (b[i] >= 82F && b[i] <= 84F)
			{
				b[i] = 3.3F;
			}
			else if (b[i] >= 78F && b[i] <= 81F)
			{
				b[i] = 3.0F;
			}
			else if (b[i] >= 75F && b[i] <= 77F)
			{
				b[i] = 2.7F;
			}
			else if (b[i] >= 72F && b[i] <= 74F)
			{
				b[i] = 2.3F;
			}
			else if (b[i] >= 68F && b[i] <= 71F)
			{
				b[i] = 2.0F;
			}
			else if (b[i] >= 64F && b[i] <= 67F)
			{
				b[i] = 1.5F;
			}
			else if (b[i] >= 60F && b[i] <= 63F)
			{
				b[i] = 1.0F;
			}
			else
			{
				b[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum2 = sum2 + (a[i] * b[i]);
		}
		GPA = sum2 / sum1;
		System.out.printf("%.2f",GPA);
	}
}

