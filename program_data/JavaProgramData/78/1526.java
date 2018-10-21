package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int p = 0; //??????p
		char k = 0;
		for (int z = 1 ; z < 6 ; z++) //?????????????z,q,s,l
		{
			for (int q = 1 ; q < 6 ; q++)
			{
				for (int s = 1 ; s < 6 ; s++)
				{
					for (int l = 1 ; l < 6 ; l++)
					{
						if (z + q == s + l && z + l > q + s && z + s < q && z != q && z != s && z != l && q != s && q != l && s != l) //????
						{
							int[] a = new int[4]; //??????
							String b = new String(new char[4]); //???????
							a[0] = z * 10; //???????
							a[1] = q * 10;
							a[2] = s * 10;
							a[3] = l * 10;
							b = tangible.StringFunctions.changeCharacter(b, 0, 'z'); //????????
							b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 2, 's');
							b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
							for (int i = 0 ; i < 4 ; i++) //???a??????
							{
								for (int j = i + 1 ; j < 4 ; j++)
								{
									if (a[i] < a[j])
									{
										p = a[j];
										a[j] = a[i];
										a[i] = p;

										k = b.charAt(j);
										b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
										b = tangible.StringFunctions.changeCharacter(b, i, k);
									}
									else
									{
										continue;
									}
								}
							}
							System.out.print(b.charAt(0));
							System.out.print(" ");
							System.out.print(a[0]);
							System.out.print('\n');
							System.out.print(b.charAt(1));
							System.out.print(" ");
							System.out.print(a[1]);
							System.out.print('\n');
							System.out.print(b.charAt(2));
							System.out.print(" ");
							System.out.print(a[2]);
							System.out.print('\n');
							System.out.print(b.charAt(3));
							System.out.print(" ");
							System.out.print(a[3]);
							System.out.print('\n');
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
		return 0;

	}


}

