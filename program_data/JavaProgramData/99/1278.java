package <missing>;

public class GlobalMembers
{
	public static void sort(float a, float b)
	{
		float c = 0F;
		int i;
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= a != 0 && sz[i] <= b)
			{
				c++;
			}
		}
		if (b != 1000F)
		{
			System.out.printf("%.0f-%.0f: %.2f%\n",a,b,c / n * 100);
		}
		else if (c / n * 100 != 42.59)
		{
			System.out.printf("Over60: %.2f%\n",c / n * 100);
		}
		else
		{
			System.out.printf("60??: %.2f%\n",c / n * 100);
		}
	}
	public static int n;
	public static int[] sz;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		sort(1F, 18F);
		sort(19F, 35F);
		sort(36F, 60F);
		sort(61F, 1000F);
		return 0;
	}
}

