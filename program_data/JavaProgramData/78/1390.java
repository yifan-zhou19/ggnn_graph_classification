package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		String weight = new String(new char[6]);
		for (z = 1;z < 6;z++)
		{
			for (q = 1;q < 6;q++)
			{
				if (z == q)
				{
					continue;
				}
				else
				{
					for (s = 1;s < 6;s++)
					{
						if (s == z || s == q)
						{
							continue;
						}
						else
						{
							for (l = 1;l < 6;l++)
							{
								if (l == z || l == q || l == s)
								{
									continue;
								}
								else
								{
									if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
									{
										weight = tangible.StringFunctions.changeCharacter(weight, z, 'z');
										weight = tangible.StringFunctions.changeCharacter(weight, q, 'q');
										weight = tangible.StringFunctions.changeCharacter(weight, s, 's');
										weight = tangible.StringFunctions.changeCharacter(weight, l, 'l');
										for (i = 5;i > 0;i--)
										{
											if (i == z || i == q || i == s || i == l)
											{
												System.out.print(weight.charAt(i));
												System.out.print(" ");
												System.out.print(i * 10);
												System.out.print("\n");
											}
											else
											{
												continue;
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
		return 0;
	}

}

