package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[max];
		int tmp;
		int i;
		int j;
		float ave;
		float sum = 0F;
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
		ave = (float)sum / n;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (Math.abs(a[i] - ave) < Math.abs(a[j] - ave))
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		System.out.printf("%d",a[0]);
		i = 1;
		while (Math.abs(a[i] - ave) == Math.abs(a[0] - ave))
		{
			System.out.printf(",%d",a[i]);
			i++;
		}
		return 0;
	}

}

