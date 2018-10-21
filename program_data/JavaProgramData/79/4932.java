package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int k;
		int i;
		int j;
		int p;
		int num;
		int[] a = new int[301];
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else if (m == 1)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
				k = n + 1;
				num = 0;
				   for (i = 1;i < n + 1;i++)
				   {
					a[i] = i;
				   }
				while (num < n - 1)
				{
					for (j = 1;j < n + 1;j++)
					{
						if (a[j] != 0 && a[j] % m == 0)
						{
							 a[j] = 0;
							 num++;
						}
						else
						{
							;
						}
					}
					for (p = 1;p < n + 1;p++)
					{
						if (a[p] == 0)
						{
								 continue;
						}
						   else
						   {
							 a[p] = k;
							 k++;
						   }
					}
				}
				for (i = 2;i < n + 2;i++)
				{
					if (a[i - 1] != 0)
					{
						break;
					}
				}
				System.out.printf("%d\n",i - 1);
			}
		}
	}
}

