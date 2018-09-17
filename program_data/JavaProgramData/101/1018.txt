package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				for (k = 0; k < 3; k++)
				{
					if ((i - j) * (j - k) * (k - i) == 0)
					{
						continue;
					}
					else
					{
						int[] x = new int[3];
						String c = new String(new char[3]);
						c = tangible.StringFunctions.changeCharacter(c, 0, 'A');
						c = tangible.StringFunctions.changeCharacter(c, 1, 'B');
						c = tangible.StringFunctions.changeCharacter(c, 2, 'C');
						x[0] = 2 - ((j > i) + (k == i));
						x[1] = 2 - ((i > j) + (i > k));
						x[2] = 2 - ((k > j) + (j > i));
						if (x[0] == i && x[1] == j && x[2] == k)
						{
													for (int q = 0; q < 3; q++)
													{
								if (x[q] == 0)
								{
								System.out.print(c.charAt(q));
								}
													}

							for (int q = 0; q < 3; q++)
							{
								if (x[q] == 1)
								{
									System.out.print(c.charAt(q));
								}
							}

							for (int q = 0; q < 3; q++)
							{
								if (x[q] == 2)
								{
									System.out.print(c.charAt(q));
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

