package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int[] num = new int[310];
		int[] out = new int[310];
		double sum = 0;
		double avr = 0;
		double max = 0;
		double b;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		sum += num[i];
		}
		avr = sum / n;
		for (i = 0;i < n;i++)
		{
			b = Math.abs(num[i] - avr);
			if (b > max)
			{
				max = b;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max - Math.abs(num[i] - avr) < 1e-5)
			{
				out[j] = num[i];
			j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = 0;k < j - 1;k++)
			{
				if (out[k] > out[k + 1])
				{
				int tmp;
				tmp = out[k];
				out[k] = out[k + 1];
				out[k + 1] = tmp;
				}
			}
		}
		System.out.printf("%d",out[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",out[i]);
		}
		return 0;
	}
}

