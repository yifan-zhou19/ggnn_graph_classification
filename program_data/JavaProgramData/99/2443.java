package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		float m = 0F;
		float j = 0F;
		float p = 0F;
		float q = 0F;
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
				m = m + 1;
			}
			else if (a[i] <= 35)
			{
				j = j + 1;
			}
			else if (a[i] <= 60)
			{
				p = p + 1;
			}
			else
			{
				q = q + 1;
			}
		}
		System.out.printf("1-18: %.2f%%\n",100 * m / n);
		System.out.printf("19-35: %.2f%%\n",100 * j / n);
		System.out.printf("36-60: %.2f%%\n",100 * p / n);
		System.out.printf("60??: %.2f%%\n",100 * q / n);
	}
}

