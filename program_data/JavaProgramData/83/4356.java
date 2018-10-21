package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int i;
		int sum;
		int n;
		float[] b = new float[10];
		float[] c = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		sum = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			sum += a[i];
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[0] = Float.parseFloat(tempVar4);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Float.parseFloat(tempVar5);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((b[i] >= 90F) && (b[i] <= 100F))
			{
			c[i] = 4.0F;
			}
			if ((b[i] <= 89F) && (b[i] >= 85F))
			{
				c[i] = 3.7F;
			}
			if ((b[i] <= 84F) && (b[i] >= 82F))
			{
				c[i] = 3.3F;
			}
			if ((b[i] <= 81F) && (b[i] >= 78F))
			{
				c[i] = 3.0F;
			}
			if ((b[i] <= 77F) && (b[i] >= 75F))
			{
				c[i] = 2.7F;
			}
			if ((b[i] <= 74F) && (b[i] >= 72F))
			{
				c[i] = 2.3F;
			}
			if ((b[i] <= 71F) && (b[i] >= 68F))
			{
				c[i] = 2.0F;
			}
			if ((b[i] <= 67F) && (b[i] >= 64F))
			{
				c[i] = 1.5F;
			}
			if ((b[i] <= 63F) && (b[i] >= 60F))
			{
				c[i] = 1.0F;
			}
			if (b[i] < 60F)
			{
				c[i] = 0F;
			}
		}
			float sum1 = 0F;
			for (i = 0;i < n;i++)
			{
				sum1 += a[i] * c[i];
			}
			float GPA;
			GPA = sum1 / sum;
			System.out.printf("%.2f",GPA);
			return 0;
	}
}

