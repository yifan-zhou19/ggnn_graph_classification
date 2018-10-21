package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //???????????
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z = z + 10) //?????????????????
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{


						if (z + q == s + l && z + l > s + q && z + s < q) //????
						{
							int[] a = new int[5]; //????????int?????
							String b = new String(new char[5]); //??char????????????
							a[1] = z;
							b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
							a[2] = q;
							b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
							a[3] = s;
							b = tangible.StringFunctions.changeCharacter(b, 3, 's');
							a[4] = l;
							b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
							int i; //?????????????????????
							int j;
							int p;
							char k; //??
							for (j = 1;j <= 3;j++) //??????????????????
							{
								for (i = 1;i <= 4 - j;i++)
								{
								  if (a[i] < a[i + 1])
								  {
									p = a[i];
									a[i] = a[i + 1];
									a[i + 1] = p;
									k = b.charAt(i);
									b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
									b = tangible.StringFunctions.changeCharacter(b, i + 1, k);
								  }

								}

							}

							for (int i = 1;i <= 4;i++) //?????????????
							{
								 System.out.print(b.charAt(i));
								 System.out.print(' ');
								 System.out.print(a[i]);
								 System.out.print("\n");
							}
						}


					}
				}
			}
		}

			return 0;

	}
}

