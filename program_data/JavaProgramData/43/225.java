package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[10000];
		int[] B = new int[10000];
		int m;
		int a = 2;
		int b = 2;
		int k = 1;
		int j = 1;
		int i = 2;
		int s = 1;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (a < m)
		{
			for (i = 2;i < a;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i == a)
			{
				A[k] = a;
				k++;
			}
					a++;
		}
		while (b < m)
		{
			for (i = 2;i < b;i++)
			{
				if (b % i == 0)
				{
					break;
				}
			}
			if (i == b)
			{
				B[j] = b;
				j++;
			}
			b++;

		}
		while (s <= k)
		{
			t = 0;
			while (t <= j)
			{
				if (A[s] + B[t] == m)
				{
					if (s <= t)
					{
						System.out.printf("%d %d\n",A[s],B[t]);
					}
				}
				t++;
			}
			s++;
		}
		return 0;
	}
}

