package <missing>;

public class GlobalMembers
{
	public static void px(int[] S, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (S[j] > S[j - 1])
				{
					t = S[j - 1];
					S[j - 1] = S[j];
					S[j] = t;
				}
			}
		}
	}


	public static void Main(String[] args)
	{
		int[] S = new int[A];
		int n;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(S[p]) = Integer.parseInt(tempVar2);
			}
		}
		px(S, n);
		System.out.printf("%d\n%d\n",S[0],S[1]);





	}
}

