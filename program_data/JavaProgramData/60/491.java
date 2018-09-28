package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int N;
		int i;
		int j = 1;
		int k;
		int[] a = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N < 5)
		{
			System.out.print("empty\n");
		}

		else
		{
			for (n = 3; n < N + 1; n = n + 2)
			{
			k = 0;
			{
				for (i = 3;i < n;i = i + 2)
				{
				   if (n % i == 0)
				   {
					  k++;
				   }
				}
			}
			if (k == 0)
			{
				a[j] = n;
				j++;
			}
			}
		}
		a[0] = 2;
		for (i = 0;i < j - 1;i++)
		{
			if (a[i] + 2 == a[i + 1])
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
	}
}

