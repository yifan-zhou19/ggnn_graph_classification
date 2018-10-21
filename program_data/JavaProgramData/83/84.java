package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		float c = 0F;
		float[] a = new float[10];
		float[] b = new float[10];
		double e = 0;
		double d;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			c += a[i];

		}
		for (j = 0,i = 0;j < n,i < n;j++,i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Float.parseFloat(tempVar3);
			}
			if (b[j] >= 90F)
			{
				d = 4.0 * a[i];
			}
			else if (b[j] >= 85F && b[j] <= 89F)
			{
				d = 3.7 * a[i];
			}
			else if (b[j] >= 82F && b[j] <= 84F)
			{
				d = 3.3 * a[i];
			}
			else if (b[j] >= 78F && b[j] <= 81F)
			{
				d = 3.0 * a[i];
			}
			else if (b[j] >= 75F && b[j] <= 77F)
			{
				d = 2.7 * a[i];
			}
			else if (b[j] >= 72F && b[j] <= 74F)
			{
				d = 2.3 * a[i];
			}
			else if (b[j] >= 68F && b[j] <= 71F)
			{
				d = 2.0 * a[i];
			}
			else if (b[j] >= 64F && b[j] <= 67F)
			{
				d = 1.5 * a[i];
			}
			else if (b[j] >= 60F && b[j] <= 63F)
			{
				d = 1.0 * a[i];
			}
			else if (b[j] <= 60F)
			{
				d = 0 * a[i];
			}
			e += d;
		}
		double GPA;
		GPA = e / c;
		System.out.printf("%.2lf",GPA);
	}

}

