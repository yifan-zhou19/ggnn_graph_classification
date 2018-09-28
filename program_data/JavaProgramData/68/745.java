package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k = 6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[50000];
		for (i = 3;i <= n;i = i + 2)
		{
			int j = 3;
			a[i] = 1;
			while (j <= Math.sqrt(i))
			{
				if (i % j != 0)
				{
					j = j + 2;
				}
				else
				{
					a[i] = 0;
					j = i;
				}
			}
		}
		i = 3;
		do
		{
			while (i < k)
			{
				if (1 == (a[i] != 0 && a[k - i] != 0))
				{
					System.out.printf("%ld=%ld+%ld\n",k,i,k - i);
					i = n;
				}
				else
				{
					i = i + 2;
				}
			}
			i = 3;
			k = k + 2;
		} while (k <= n);
	}


}

