package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[400];
		int n;
		int[] b = new int[400];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int sum = 0;
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
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (n * a[i] >= sum)
			{
				b[i] = n * a[i] - sum;
			}
			else
			{
				b[i] = sum - n * a[i];
			}
		}
		int max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		int flag = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max && flag == 1)
			{
				System.out.printf(",%d",a[i]);
			}
			if (b[i] == max && flag == 0)
			{
				System.out.printf("%d",a[i]);
				flag = 1;
			}
		}
	}

}

