package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		int j = 0;
		float[] c = new float[10];
		float k = 0F;
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
			for (i = 0;i < n;i++)
			{
			if (b[i] > 89)
			{
				c[i] = a[i] * 4.0;
			}
			else if (b[i] > 84 && b[i] < 90)
			{
				c[i] = a[i] * 3.7;
			}
			else if (b[i] > 81 && b[i] < 85)
			{
				c[i] = a[i] * 3.3;
			}
			else if (b[i] > 77 && b[i] < 82)
			{
				c[i] = a[i] * 3.0;
			}
			else if (b[i] > 74 && b[i] < 78)
			{
				c[i] = a[i] * 2.7;
			}
			else if (b[i] > 71 && b[i] < 75)
			{
				c[i] = a[i] * 2.3;
			}
			else if (b[i] > 67 && b[i] < 72)
			{
				c[i] = a[i] * 2.0;
			}
			else if (b[i] > 63 && b[i] < 68)
			{
				c[i] = a[i] * 1.5;
			}
			else if (b[i] > 59 && b[i] < 64)
			{
				c[i] = a[i] * 1.5;
			}
			else if (b[i] < 60)
			{
				c[i] = 0.0F;
			}
			}
		for (i = 0;i < n;i++)
		{
			k = k + c[i];
			j = j + a[i];
		}
		k = k / j;
		System.out.printf("%.2f\n",k);
	}
}

