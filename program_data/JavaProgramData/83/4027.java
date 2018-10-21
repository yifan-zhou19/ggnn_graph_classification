package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int sum = 0;
		float[] d = new float[10];
		float gpa = 0F;
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
		for (i = n;i < 10;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
				d[i] = 0F;
				continue;
			}
			else if (b[i] >= 90)
			{
				d[i] = 4.0F;
				continue;
			}
			else if (b[i] >= 85)
			{
				d[i] = 3.7F;
				continue;
			}
			else if (b[i] >= 82)
			{
				d[i] = 3.3F;
				continue;
			}
			else if (b[i] >= 78)
			{
				d[i] = 3.0F;
				continue;
			}
			else if (b[i] >= 75)
			{
				d[i] = 2.7F;
				continue;
			}
			else if (b[i] >= 72)
			{
				d[i] = 2.3F;
				continue;
			}
			else if (b[i] >= 68)
			{
				d[i] = 2.0F;
				continue;
			}
			else if (b[i] >= 64)
			{
				d[i] = 1.5F;
				continue;
			}
			else if (b[i] >= 60)
			{
				d[i] = 1.0F;
				continue;
			}
		}
		for (i = n;i < 10;i++)
		{
			d[i] = 0F;
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
			gpa = gpa + a[i] * d[i];
		}
		gpa = gpa / sum;
		System.out.printf("%.2f",gpa);
	}

}

