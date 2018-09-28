package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int n;
	public static float sum = 0F;
	public static float ave;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
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
		void sort();
		sort();
		int flag = 0;
		if (ave - a[0] == a[n - 1] - ave)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == a[0] || a[i] == a[n - 1])
				{
					if (i != 0)
					{
						System.out.print(",");
					}
					System.out.printf("%d",a[i]);
				}
			}
		}
		else if (ave - a[0] > a[n - 1] - ave)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == a[0])
				{
					if (i != 0 && a[i + 1] == a[i])
					{
						System.out.print(",");
					}
					System.out.printf("%d",a[i]);
				}
			}
		}
		else
		{
			for (i = 0;a[i] != 0;i++)
			{
				if (a[i] == a[n - 1])
				{
					if (flag != 0)
					{
						System.out.print(",");
					}
					System.out.printf("%d",a[i]);
					flag = 1;
				}
			}
		}
		return 0;
	}
	public static void sort()
	{
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a[i] > a[j])
				{
					int t;
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
}

