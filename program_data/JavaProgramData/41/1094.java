package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] word = new int[6];
		int[] r = new int[6];
		int i = 1;
		int s = 1;
		int t = 1;
		int u = 1;
		int o = 1;
		int j = 0;
		int[] c = {5, 2, 1, 3, 4};
		for (r[1] = i;i <= 5;i++)
		{
			for (r[2] = s;s <= 5;s++)
			{
			if (r[1] == r[2])
			{
				continue;
			}
			{
			for (r[3] = t;t <= 5;t++)
			{
			if (r[3] == r[2] || r[3] == r[1])
			{
				continue;
			}
			{
						for (r[4] = u;u <= 5;u++)
						{
						if (r[4] == r[1] || r[4] == r[2] || r[4] == r[3])
						{
							continue;
						}
						{
						for (r[5] = o;o <= 5;o++)
						{
						if (r[5] == r[4] || r[5] == r[3] || r[5] == r[2] || r[5] == r[1])
						{
							continue;
						}
						{
						word[1] = (r[1] == 5);
							word[2] = (r[2] == 2);
							word[3] = (r[5] == 1);
							word[4] = (r[1] != 3);
							word[5] = (r[1] == 4);
								if (word[r[1]] == 1 && word[r[2]] == 1 && word[r[3]] == 0 && word[r[4]] == 0 && word[r[5]] == 0 && r[2] != 5 && r[3] != 5)
								{
									for (i = 1;i <= 5;i++)
									{
									if (r[i] == 1)
									{
								System.out.print(i);
									}
									}
								 for (i = 1;i <= 5;i++)
								 {
									 if (r[i] == 2)
									 {
								 System.out.print(i);
									 }
								 }
									for (i = 1;i <= 5;i++)
									{
										if (r[i] == 3)
										{
									System.out.print(i);
										}
									}
									for (i = 1;i <= 5;i++)
									{
										if (r[i] == 4)
										{
									System.out.print(i);
										}
									}
									for (i = 1;i <= 5;i++)
									{
										if (r[i] == 5)
										{
									System.out.print(i);
										}
									}
								}
								for (i = 0;i < 5;i++)
								{
								System.out.print(c[i]);
								}
				}
						}
				}
						}
				}
			}
	}
			}
		}
		System.out.print(c[0]);
		for (i = 1;i < 5;i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	 return 0;
	}
}
