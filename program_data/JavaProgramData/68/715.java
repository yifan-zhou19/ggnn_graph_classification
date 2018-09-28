package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int m;
		int m1;
		int k;
		int k1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i++)
		{
			if ((i % 2) == 0)
			{
				for (j = 2;j <= i / 2;j++)
				{
					k = (int)Math.sqrt((double)j);
					if ((j % 2) != 0)
					{
						for (m = 3 ; m <= k ; m += 2) //????
						{
							if ((j % m) == 0)
							{
								break; //???????
							}
						}
						if (m > k)
						{
							l = i - j;
							k1 = (int)Math.sqrt((double)l);
							if ((l % 2) != 0)
							{
								for (m1 = 3 ; m1 <= k1 ; m1 += 2) //????
								{
									if ((l % m1) == 0)
									{
										break; //???????
									}
								}
								if (m1 > k1)
								{
									System.out.print(i);
									System.out.print("=");
									System.out.print(j);
									System.out.print("+");
									System.out.print(l);
									System.out.print("\n");
									break;
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}

}

