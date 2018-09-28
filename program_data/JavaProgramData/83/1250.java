package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[][] a = new float[2][10];
		float sum;
		float d;
		sum = 0F;
		d = 0F;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][i] = Float.parseFloat(tempVar2);
			}
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][i] = Float.parseFloat(tempVar3);
			}
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			if (a[1][i] >= 90F)
			{
				a[1][i] = 4.0F;
			}
			else if (a[1][i] >= 85F)
			{
				a[1][i] = 3.7F;
			}
			else if (a[1][i] >= 82F)
			{
				a[1][i] = 3.3F;
			}
			else if (a[1][i] >= 78F)
			{
				a[1][i] = 3.0F;
			}
			else if (a[1][i] >= 75F)
			{
				a[1][i] = 2.7F;
			}
			else if (a[1][i] >= 72F)
			{
				a[1][i] = 2.3F;
			}
			else if (a[1][i] >= 68F)
			{
				a[1][i] = 2.0F;
			}
			else if (a[1][i] >= 64F)
			{
				a[1][i] = 1.5F;
			}
			else if (a[1][i] >= 60F)
			{
				a[1][i] = 1.0F;
			}
			else
			{
				a[1][i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[0][i] * a[1][i];
			d = d + a[0][i];
		}
		System.out.printf("%.2f",sum / d);
	}
}

