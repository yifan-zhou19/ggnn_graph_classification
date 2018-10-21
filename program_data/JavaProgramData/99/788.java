package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		float x = 0F;
		float y = 0F;
		float z = 0F;
		float m = 0F;
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
			if (a[i] <= 18)
			{
				x++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				y++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				z++;
			}
			if (a[i] > 60)
			{
				m++;
			}
		}
		x = x * 1.0 / n * 100;
		y = y * 1.0 / n * 100;
		z = z * 1.0 / n * 100;
		m = m * 1.0 / n * 100;
		System.out.printf("1-18: %.2f%%\n",x);
		System.out.printf("19-35: %.2f%%\n",y);
		System.out.printf("36-60: %.2f%%\n",z);
		System.out.printf("60??: %.2f%%\n",m);



		return 0;
	}


}

