package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int i;
		float u;
		float x;
		float y;
		float z;
		float f = 1F;
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
				b = b + 1;
			}
			if (a[i] > 18 && a[i] <= 35)
			{
				c = c + 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				d = d + 1;
			}
			if (a[i] > 60)
			{
				e = e+1;
			}
		}
		u = f * b / n * 100;
		x = f * c / n * 100;
		y = f * d / n * 100;
		z = f * e / n * 100;
		System.out.printf("1-18: %.2f%\n",u);
		System.out.printf("19-35: %.2f%\n",x);
		System.out.printf("36-60: %.2f%\n",y);
		System.out.printf("60??: %.2f%\n",z);
	}
}

