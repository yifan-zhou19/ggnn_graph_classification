package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int m;
		int b2;
		int t;
		int i;
		int j;
		int k;
		int sum = 0;
		int[] d = new int[1001];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b2 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (m = b2;m <= b;m++)
		{
				k = (int)Math.sqrt(m);
				for (i = 2;i <= k;i++)
				{
					if (m % i == 0)
					{
						break;
					}

				}
				if (i >= k + 1)
				{
					t = m;

			  for (i = 0;;i++)
			  {
			if (t != 0)
			{
				a[i] = t % 10;
				t = t / 10;
			}
		   else
		   {
			   break;
		   }
			  }
		for (j = 0;j <= i - 1;j++)
		{
			if (a[j] != a[i - 1 - j])
			{
				break;
			}
		}
		if (j >= i)
		{
			   sum++;
			   d[sum] = m;
		}

				}


		}
		if (sum == 0)
		{
			System.out.print("no");
		}

		else
		{
			for (i = 1;i < sum;i++)
			{
			System.out.printf("%d,",d[i]);
			}
		System.out.printf("%d",d[sum]);
		}
	}


}

