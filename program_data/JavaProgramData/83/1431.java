package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		float[] b = new float[10];
		float x;
		float y = 0F;
		float sum = 0F;
		int i;
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
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i,n;i++)
		{
		if (b[i] <= 100F && b[i] >= 90F)
		{
			b[i] = 4.0F;
		}
		else if (b[i] <= 89F && b[i] >= 85F)
		{
			b[i] = 3.7F;
		}
		else if (b[i] <= 84F && b[i] >= 82F)
		{
			b[i] = 3.3F;
		}
		else if (b[i] <= 81F && b[i] >= 78F)
		{
			b[i] = 3.0F;
		}
		else if (b[i] <= 77F && b[i] >= 75F)
		{
			b[i] = 2.7F;
		}
		else if (b[i] <= 74F && b[i] >= 72F)
		{
			b[i] = 2.3F;
		}
		else if (b[i] <= 71F && b[i] >= 68F)
		{
			b[i] = 2.0F;
		}
		else if (b[i] <= 67F && b[i] >= 64F)
		{
			b[i] = 1.5F;
		}
		else if (b[i] <= 63F && b[i] >= 60F)
		{
			b[i] = 1.0F;
		}
		else if (b[i] < 60F)
		{
			b[i] = 0F;
		}
		x = b[i] * a[i];
		y = y + x;
		}
		System.out.printf("%.2f",y / sum);
		return 0;
	}



}

