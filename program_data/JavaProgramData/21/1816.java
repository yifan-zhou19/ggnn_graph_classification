package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] num;
		int tem;
		float mean;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					tem = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tem;
				}
			}
		}
		sum = 0F;
		for (i = 0;i < n;i++)
		{
			sum += num[i];
		}
		mean = sum / n;
		if (Math.abs(mean - num[0]) - Math.abs(mean - num[n - 1]) > 0)
		{
			System.out.printf("%d",num[0]);
		}
		else if (Math.abs(mean - num[0]) - Math.abs(mean - num[n - 1]) < 0)
		{
			System.out.printf("%d",num[n - 1]);
		}
		else
		{
			System.out.printf("%d,%d",num[0],num[n - 1]);
		}
	}
}

