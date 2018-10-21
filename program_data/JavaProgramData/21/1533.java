package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[301];
		int[] out = new int[301];
		int j = 0;
		int p;
		int q;
		int temp;
		double sum = 0;
		double avr;
		double[] dif = new double[301];
		double max = 0;
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
		avr = sum / i;
		for (i = 0;i < n;i++)
		{
			dif[i] = Math.abs(num[i] - avr);
			if (dif[i] > max)
			{
				int[] out = new int[301];
				j = 0;
				max = dif[i];
			}
			if (dif[i] == max)
			{
				out[j] = num[i];
				j++;
			}
		}
		for (p = 0;p < j - 1;p++)
		{
			for (q = j - 1;q > p;q--)
			{
				if (out[q] < out[q - 1])
				{
					temp = out[q];
					out[q] = out[q - 1];
					out[q - 1] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i == j - 1)
			{
				System.out.printf("%d\n",out[i]);
			}
			else
			{
				System.out.printf("%d,",out[i]);
			}
		}
		return 0;
	}
}

