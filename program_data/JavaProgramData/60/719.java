package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10000];
		int i = 0;
		int k;
		int j;
		int b = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}

		else
		{
			for (k = 3;k <= n;k = k + 2)
			{
				for (j = 3;j <= Math.sqrt(k);j = j + 2)
				{
					if (k % j == 0)
					{
						q = q + 1;
						break;
					}
				}
				if (q == 0)
				{
					a[i] = k;
					i = i + 1;
				}
				else
				{
					q = 0;
				}
			}

		for (j = 0;j < i - 1;j++)
		{
			if (a[j] + 2 == a[j + 1])
			{
				System.out.printf("%d %d\n",a[j],a[j + 1]);
				b = b + 1;
			}
		}
		if (b == 0)
		{
			System.out.print("empty\n");
		}
		}
	}








}

