package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] > 0 && sz[i] < 19)
			{
				a++;
			}
			if (sz[i] > 18 && sz[i] < 36)
			{
				b++;
			}
			if (sz[i] > 35 && sz[i] < 61)
			{
				c++;
			}
			if (sz[i] > 60)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2f%%\n",a * 1.0 / n * 100.0);
		System.out.printf("19-35: %.2f%%\n",b * 1.0 / n * 100.0);
		System.out.printf("36-60: %.2f%%\n",c * 1.0 / n * 100.0);
		System.out.printf("60??: %.2f%%\n",d * 1.0 / n * 100.0);
		return 0;
	}
}

