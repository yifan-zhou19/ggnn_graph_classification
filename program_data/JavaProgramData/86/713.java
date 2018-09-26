package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] a = new int[100];
		int[] result = new int[100];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				result[i - 1] = 60;
			}
			else if (m != 0)
			{
				for (j = 1;j <= m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j - 1] = Integer.parseInt(tempVar3);
					}
				}

				for (k = m;k >= 1;k--)
				{
					sum = a[k - 1] + k * 3;

					if (sum <= 60)
					{

						  if (k + 1 <= m != 0 && 60 - sum> a[k] - a[k - 1])
						  {
							  result[i - 1] = a[k];
						  break;
						  }
						  else
						  {
							  result[i - 1] = 60 - sum + a[k - 1];
							  break;
						  }

					}
					else if (sum > 60)
					{
						continue;
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",result[i - 1]);
		}
		return 0;
	}
}

