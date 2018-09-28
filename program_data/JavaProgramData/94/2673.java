package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[MAX];
		int[] odd = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < N; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int remainder;
		int k = 0;
		for (int j = 0; j < N; j++)
		{
			remainder = sz[j] % 2;
			if (remainder != 0)
			{
				odd[k] = sz[j];
				k++;
			}
		}
	//find the odd numbers
		int t;
		for (int p = 1; p < k; p++)
		{
			for (int q = 0; q < k - p; q++)
			{
				if (odd[q] > odd[q + 1])
				{
					t = odd[q];
					odd[q] = odd[q + 1];
					odd[q + 1] = t;
				}
			}
		}
	//arrange the numbers from small to large
		for (int m = 0; m < k; m++)
		{
			if (m == k - 1)
			{
				System.out.printf("%d", odd[m]);
			}
			else
			{
				System.out.printf("%d,", odd[m]);
			}
		}
		return 0;
	}

}

