package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int sum;
		int temp;
		int k;
		int f;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						sum = 0;
						temp = 0;
						f = 0;
						d = 0;
						e = 0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						for (j = 0;j < m;j++)
						{
										String tempVar3 = ConsoleInput.scanfRead();
										if (tempVar3 != null)
										{
											k = Integer.parseInt(tempVar3);
										}
										if ((k + d * 3 + 1) < 59)
										{
														d++;
										}
										if ((k + d * 3 + 1) == 59)
										{
														 temp++;
										}
										if ((k + d * 3 + 1) == 60)
										{
														 f++;
										}
										if ((k + d * 3 + 1) > 60)
										{
														e++;
										}
						}
						sum = 60 - (3 * m) + temp + (2 * f) + 3 * e;
						System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

