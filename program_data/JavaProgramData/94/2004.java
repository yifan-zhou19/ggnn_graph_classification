package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{ //?????????b
				b[k] = a[i];
				k = k + 1;
			}
		}
			int m;
			int t;
				for (i = 0;i < k;i++)
				{
											m = i;
											for (int j = i + 1;j < k;j++)
											{
												if (b[j] < b[m])
												{
													m = j; //????
												}
											}
											t = b[i];
											b[i] = b[m];
											b[m] = t;
				}
				for (i = 0;i < k;i++)
				{
					if (i > 0)
					{
						System.out.print(",");
					}
					 System.out.print(b[i]);
				}
				return 0;



	}

}

