package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] m = new int[4];
		int max = 0;
		int i;
		int j;
		String[] n = {"z", "q", "s", "l"};
		for (z = 1;z < 6;z++)
		{
			for (q = 1;q < 6;q++)
			{
				if (q != z)
				{
					for (s = 1;s < 6;s++)
					{
						if (s != q && s != z)
						{
							for (l = 1;l < 6;l++)
							{
								if (l != z && l != s && l != q)
								{
									if ((z + q == s + l) && ((z + l) > (s + q)) && (z + s < q))
									{
										m[0] = z;
										m[1] = q;
										m[2] = s;
										m[3] = l;
										for (j = 0;j < 4;j++)
										{
											for (i = 0;i < 4;i++)
											{
												if (m[i] > m[max])
												{
													max = i;
												}
											}
												System.out.print(n[max]);
												System.out.print(' ');
												System.out.print(m[max] * 10);
												System.out.print("\n");
												m[max] = 0;
										}
									}
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
