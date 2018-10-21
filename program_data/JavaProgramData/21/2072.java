package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int N;
		int[] a = new int[301];
		int[] b = new int[100];
		int p;
		int q;
		int temp;
		int sum = 0;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}

		if (sum < a[0] * N)
		{
			max = a[0] * N - sum;
		}
		else
		{
			max = sum - a[0] * N;
		}
		for (i = 1;i < N;i++)
		{
			if (sum - a[i] * N > max)
			{
				max = sum - a[i] * N;
			}
			else if (a[i] * N - sum > max)
			{
				max = a[i] * N - sum;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sum - a[i] * N == max || a[i] * N - sum == max)
			{
				b[j++] = a[i];
			}
		}
		for (p = 0;p < j - 1;p++)
		{
			for (q = p + 1;q < j;q++)
			{
				if (b[q] < b[p])
				{
				temp = b[p];
				b[p] = b[q];
				b[q] = temp;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[i]);

	}

}

