package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum = 0;
		int i;
		int j = 0;
		int bcount = 0;
		int temp = 0;
		int[] a = new int[300];
		int[] b = {15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double ave;
		double c = 0;
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
		ave = (double)sum / (double)n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(ave - a[i]) > c)
			{
				c = Math.abs(ave - a[i]);
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (Math.abs(ave - a[i]) == c)
			{
				b[j] = a[i];
				j++;
			}
		}
		bcount = j;
		for (i = 0;i < bcount - 1;i++)
		{
			for (j = 0;j < bcount - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < bcount;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}

}

