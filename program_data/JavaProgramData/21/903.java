package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		int j;
		float ave;
		float sum = 0F;
		float m;
		int[] a = new int[391];
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
			for (j = i;j < n;j++)
			{
				if (a[j] < a[i])
				{
					m = a[j];
					a[j] = a[i];
					a[i] = m;
				}
			}
		}
		m = Math.abs(a[0] - ave);
		if (m < a[n - 1] - ave)
		{
			m = a[n - 1] - ave;
		}
		for (i = 0;i < n;i++)
		{
			if ((Math.abs(a[i] - ave) - m < 0.1F) && (Math.abs(a[i] - ave) - m>-0.1F))
			{
				if (k != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				k++;
			}
		}
		return 0;
	}

}

