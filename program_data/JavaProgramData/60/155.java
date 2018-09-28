package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100000];
		int m;
		int i;
		int j = 0;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 3;m <= n;m = m + 2)
		{
			k = Math.sqrt(m);
			for (i = 2;i <= k;i++)
			{
				if (m % i == 0)
				{
					break;
				}
			}
				if (i >= k + 1)
				{
					a[j] = m;
					j++;
				}
		}

		if (j == 1 || j == 0)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 0;i < j - 1;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
			System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
		}
	}





}

