package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[max];
		int[] b = new int[4];
		int i;
		int m;
		float[] c = new float[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		 if (a[i] >= 1 && a[i] <= 18)
		 {
			  b[0]++;
		 }
		else if (a[i] >= 19 && a[i] <= 35)
		{
			  b[1]++;
		}
		else if (a[i] >= 36 && a[i] <= 60)
		{
			  b[2]++;
		}
		else if (a[i] > 60)
		{
			  b[3]++;
		}
		}
		for (i = 0;i < 4;i++)
		{
			c[i] = b[i] * 1.0 / m * 1.0 * 100;
		}
		System.out.printf("1-18: %.2f%%\n",c[0]);
		System.out.printf("19-35: %.2f%%\n",c[1]);
		System.out.printf("36-60: %.2f%%\n",c[2]);
		System.out.printf("60??: %.2f%%",c[3]);
	}
}

