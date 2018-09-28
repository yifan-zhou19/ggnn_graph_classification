package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		float max;
		float sum = 0F;
		float ave;
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
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					max = a[j];
					a[j] = a[j + 1];
					a[j + 1] = max;
				}
			}
		}
		if (ave - a[0] > a[n - 1] - ave)
		{
			max = ave - a[0];
		}
		else
		{
			max = a[n - 1] - ave;
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < 1e-5)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j - 1]);
	}
}

