package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] b = new int[10];
		float f = 0F;
		float[] a = new float[10];
		float t = 0F;
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
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				f = f + 4.0 * a[i];
			}
			else if (b[i] >= 85)
			{
				f = f + 3.7 * a[i];
			}
			else if (b[i] >= 82)
			{
				f = f + 3.3 * a[i];
			}
			else if (b[i] >= 78)
			{
				f = f + 3.0 * a[i];
			}
			else if (b[i] >= 75)
			{
				f = f + 2.7 * a[i];
			}
			else if (b[i] >= 72)
			{
				f = f + 2.3 * a[i];
			}
			else if (b[i] >= 68)
			{
				f = f + 2.0 * a[i];
			}
			else if (b[i] >= 64)
			{
				f = f + 1.5 * a[i];
			}
			else if (b[i] >= 60)
			{
				f = f + 1.0 * a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			t = t + a[i];
		}
		System.out.printf("%.2f",f / t);
	}
}

