package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j1 = 0;
		int j2 = 0;
		int sum = 0;
		double ave;
		double qq = 0.0;
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
			if (qq < Math.abs(a[i] - ave))
			{
				qq = Math.abs(a[i] - ave);
				j1 = i;
			}
			if (qq == Math.abs(a[i] - ave) && a[i] != a[j1])
			{
				j2 = i;
			}
		}
		if (Math.abs(a[j1] - ave) == Math.abs(a[j2] - ave))
		{
			if (a[j1] > a[j2])
			{
				System.out.printf("%d,%d",a[j2],a[j1]);
			}
			else if (a[j1] == a[j2])
			{
				System.out.printf("%d",a[j1]);
			}
			else
			{
				System.out.printf("%d,%d",a[j1],a[j2]);
			}
		}
		else
		{
			System.out.printf("%d",a[j1]);
		}
	}

}

