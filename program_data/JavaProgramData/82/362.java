package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		k = 0;
		i = 1;
		while (i <= n)
		{
					int a;
					int f;
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						f = Integer.parseInt(tempVar3);
					}
					if (a >= 90 && a <= 140 && f >= 60 && f <= 90)
					{
													b += 1;
					}
													else
													{
														  if (b > k)
														  {
																  k = b;
																  b = 0;
														  }
																  else
																  {
																		k = k;
																		b = 0;
																  }
													}
																  i += 1;
		}
		if (b > k)
		{
				k = b;
		}
				else
				{
					  k = k;
				}
		System.out.printf("%d",k);

	 return 0;
	}


}

