package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double max = 0;
		int[] num = new int[310];
		int[] out = new int[310];
		double sum = 0;
		double avr = 0;
		int i = 0;
		int j = 0;
		int k = 0;
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
			if (Math.abs(num[i] - avr) > max)
			{
				max = Math.abs(num[i] - avr);
			}
		}

		//printf("%f \n",max);

		for (i = 0;i < n;i++)
		{
			if (max - (Math.abs(num[i] - avr)) < 1e-5)
			{
				out[j] = num[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = 0;k < j - i - 1;k++)
			{
				if (out[k] > out[k + 1])
				{
					int tmp = out[k];
					out[k] = out[k + 1];
					out[k + 1] = tmp;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",out[i]);
		}
		System.out.printf("%d",out[j - 1]);
		return 0;
	}

}

