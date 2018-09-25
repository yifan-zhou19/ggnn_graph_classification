package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		int[] a = new int[300];
		float ave = 0F;
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
		ave = sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		if ((ave - a[0]) > (a[n - 1] - ave))
		{
			System.out.printf("%d",a[0]);
		}
		else if ((ave - a[0]) < (a[n - 1] - ave))
		{
			System.out.printf("%d",a[n - 1]);
		}
		else
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		return 0;
	}

}

