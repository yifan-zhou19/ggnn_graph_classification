package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int j;
		int t;
		float aver;
		float x;
		float y;
		float sum = 0.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		aver = sum / n;
		for (i = 2;i <= n;i++)
		{
			for (j = i - 1;j >= 1;j--)
			{
				if (a[j + 1] < a[j])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		x = aver - a[1];
		y = a[n] - aver;
		if (x == y)
		{
			System.out.printf("%d,%d",a[1],a[n]);
		}
		if (x > y)
		{
			System.out.printf("%d",a[1]);
		}
		if (x < y)
		{
			System.out.printf("%d",a[n]);
		}
		return 0;
	}
}

