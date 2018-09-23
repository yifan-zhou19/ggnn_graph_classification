package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int j;
		int num = 1;
		int[] res = new int[301];
		int temp;
		double n;
		double ave;
		double[] c = new double[301];
		double sum = 0.0;
		double max = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = sum / n;
		for (i = 1; i <= n; i++)
		{
			c[i] = Math.abs(a[i] - ave);
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (c[i] == max)
			{
				res[num] = a[i];
				num++;
			}
		}
		num--;
		for (j = 1; j <= num - 1; j++)
		{
			for (i = 1; i <= num - j; i++)
			{
				if (res[i] > res[i + 1])
				{
					temp = res[i];
					res[i] = res[i + 1];
					res[i + 1] = temp;
				}
			}
		}
		for (i = 1; i < num; i++)
		{
			System.out.print(res[i]);
			System.out.print(',');
		}
		System.out.print(res[num]);
		return 0;
	}
}

