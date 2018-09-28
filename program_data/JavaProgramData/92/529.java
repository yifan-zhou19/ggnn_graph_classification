package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int temp;
		int t;
		int min;
		int x;
		int y = 0;
		int sum = 0;
		int j;
		int tt;
		int af;
		int as;
		int bf;
		int bs;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			y = 0;
			sum = 0;
			for (i = 0;i < 1000;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (b[j] < b[j + 1])
					{
						temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
					}
				}
			}
			as = n - 1;
			bs = n - 1;
			af = 0;
			bf = 0;
			for (i = n - 1;i >= af;i--)
			{
				if (a[i] > b[bs])
				{
					as--;
					bs--;
					sum += 200;
				}
				else if (a[i] < b[bs])
				{
					as--;
					bf++;
					sum -= 200;
				}
				else
				{
					while (a[af] > b[bf])
					{
						af++;
						bf++;
						sum += 200;
					}
					if (a[af] < b[bf])
					{
						as--;
						bf++;
						sum -= 200;
					}
					else if (i > af)
					{
						if (a[i] < b[bf])
						{
							sum -= 200;
						}
						as--;
						bf++;
					}
				}
			}
			System.out.printf("%d\n",sum);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}
}

