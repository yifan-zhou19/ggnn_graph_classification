package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int j;
		String rank = new String(new char[6]);

		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (z != q)
				{
						for (s = 1;s <= 5;s++)
						{
							if (s != z && s != q)
							{
								for (l = 1;l <= 5;l++)
								{
								  if (l != z && l != q && l != s)
								  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
									memset(rank,0,(Character.SIZE / Byte.SIZE));
									rank = tangible.StringFunctions.changeCharacter(rank, z, 'z');
									rank = tangible.StringFunctions.changeCharacter(rank, q, 'q');
									rank = tangible.StringFunctions.changeCharacter(rank, s, 's');
									rank = tangible.StringFunctions.changeCharacter(rank, l, 'l');

									if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
									{

										for (j = 5;j >= 1;j--)
										{
													 if (rank.charAt(j) != 0)
													 {
																   System.out.print(rank.charAt(j));
																   System.out.print(' ');
																   System.out.print(j * 10);
																   System.out.print("\n");
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

