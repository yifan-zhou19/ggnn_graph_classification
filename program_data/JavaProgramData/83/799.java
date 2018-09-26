package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] xueke = new int[10];
		int[] fenshu = new int[10];
		int xuekezong = 0;
		double zong = 0.0;
		double j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		while (i < n)
		{
			if (i == (n - 1))
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xueke[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xueke[i] = Integer.parseInt(tempVar3);
			}
			}
			xuekezong += xueke[i];
			i++;
		}
		i = 0;
		while (i < n)
		{
			if (i == (n - 1))
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					fenshu[i] = Integer.parseInt(tempVar4);
				}
			}
			else
			{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				fenshu[i] = Integer.parseInt(tempVar5);
			}
			}
			if (90 <= fenshu[i])
			{
				zong += xueke[i] * 4.0;
			}
			else
			{
				if (85 <= fenshu[i])
				{
					zong += xueke[i] * 3.7;
				}
				else
				{
					if (82 <= fenshu[i])
					{
						zong += xueke[i] * 3.3;
					}
					else
					{
						if (78 <= fenshu[i])
						{
							zong += xueke[i] * 3.0;
						}
						else
						{
							if (75 <= fenshu[i])
							{
								zong += xueke[i] * 2.7;
							}
							else
							{
								if (72 <= fenshu[i])
								{
									zong += xueke[i] * 2.3;
								}
								else
								{
									if (68 <= fenshu[i])
									{
										zong += xueke[i] * 2.0;
									}
									else
									{
										if (64 <= fenshu[i])
										{
											zong += xueke[i] * 1.5;
										}
										else
										{
											if (60 <= fenshu[i])
											{
												zong += xueke[i] * 1.0;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			i++;
		}
		j = zong / xuekezong;
		System.out.printf("%.2lf\n", j);
	}

}

