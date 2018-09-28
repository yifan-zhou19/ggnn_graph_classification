package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int k;
		int m;
		int[] sushu = new int[50000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

		for (m = 3;m < 50000;m += 2)
		{
			k = (int)Math.sqrt(m);
			for (i = 3;i <= k;i++)
			{
				if (m % i == 0)
				{
					break;
				}
			}
			if (i >= k + 1)
			{
				sushu[m] = 1;
			}
		}
		sushu[2] = 1;

		for (n = 6;n <= a;n += 2)
		{
			for (i = 3;i <= n / 2;i++)
			{
				if (sushu[i] != 0 && sushu[n - i] != 0)
				{
					System.out.printf("%d=%d+%d\n",n,i,n - i);
					break;
				}
			}

		}
		return 0;

	}


}

