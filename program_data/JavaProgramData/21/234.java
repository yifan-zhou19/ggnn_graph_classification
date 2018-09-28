package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int[] a = new int[400];
	public static int j = 0;
	public static int m;
	public static void Main()
	{
		float s = 0F;
		float d = 0F;
		float[] b = new float[400];
		float x;
		int[] c = new int[400];
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
			s = s + a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= s)
			{
				b[i] = a[i] - s;
			}
			else
			{
				b[i] = s - a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > d)
			{
				d = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > d)
			{
				x = b[i] - d;
			}
			else
			{
				x = d - b[i];
			}
			if (x < 1e-6F)
			{
				if (a[i] < c[j])
				{
					c[j + 1] = c[j];
					c[j++] = a[i];
				}
				else
				{
					c[j++] = a[i];
				}
			}
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",c[i]);
		}

	}

}

