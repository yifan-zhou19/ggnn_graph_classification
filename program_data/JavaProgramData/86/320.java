package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a;
		int t;
		int[] b = new int[20];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (t = 1;t <= a;t++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[t] = Integer.parseInt(tempVar3);
					}
					sum = b[t] + 3 * t;
					if (sum <= 60 && t == a)
					{
						System.out.printf("%d\n",60 - 3 * a);
					}
					else if (sum > 60 && sum - 3 <= 60)
					{
						System.out.printf("%d\n",b[t]);
					}
					else if (sum - 3 > 60 && b[t - 1] + 3 * (t - 1) < 60)
					{
						System.out.printf("%d\n",63 - 3 * t);
					}
				}
			}
		}
	}
}

