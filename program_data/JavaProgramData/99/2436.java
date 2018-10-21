package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		float[] c = new float[4];
		float[] b = new float[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				b[0]++;
			}
			else if (a[i] <= 35)
			{
				b[1]++;
			}
			else if (a[i] <= 60)
			{
				b[2]++;
			}
			else
			{
				b[3]++;
			}
		}
		for (i = 0;i <= 3;i++)
		{
			c[i] = 100 * b[i] / n;
		}
		System.out.printf("1-18: %.2f%%\n",c[0]);
		System.out.printf("19-35: %.2f%%\n",c[1]);
		System.out.printf("36-60: %.2f%%\n",c[2]);
		System.out.printf("60??: %.2f%%\n",c[3]);
	}
}

