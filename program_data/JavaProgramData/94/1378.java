package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int sum = 0;
		int m;
		int i;
		int a;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] N = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N[i] = Integer.parseInt(tempVar2);
			}
			if (N[i] % 2 != 0)
			{
				sum++;
			}
		}
		int[] P = new int[sum];
		for (i = 0;i < n;i++)
		{
			if (N[i] % 2 != 0)
			{
				P[k] = N[i];
				k++;
			}
		}
		for (m = 0;m < sum;m++)
		{
			for (i = sum - 2;i >= 0;i--)
			{
				if (P[i] > P[i + 1])
				{
					a = P[i + 1];
					P[i + 1] = P[i];
					P[i] = a;
				}
			}
		}
		for (m = 0;m < sum - 1;m++)
		{
			System.out.printf("%d,",P[m]);
		}
		System.out.printf("%d",P[sum - 1]);
		return 0;
	}





}

