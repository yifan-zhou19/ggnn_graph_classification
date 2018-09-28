package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int flag = 0;
		int temp;
		double max = 0;
		double sum = 0.0;
		int[] a = new int[300];
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
			sum = sum + a[i];
		}
		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - sum) > max)
			{
				max = Math.abs(a[i] - sum);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			 for (k = 0;k < n - 1 - i;k++)
			 {
				if (a[k] > a[k + 1])
				{
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (max - Math.abs(a[i] - sum) < 0.000000001)
			{
				if (flag == 0)
				{
					flag++;
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}
}

