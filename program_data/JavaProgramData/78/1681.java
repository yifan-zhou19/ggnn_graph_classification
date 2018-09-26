package <missing>;

public class GlobalMembers
{
	/*
	 *  ???????
	 *   ????? 2010-11-20
	 *    ??????
	 *    ??????????????????????????;
	 *     ???????????????????????????????????????????
	 */


	public static int Main()
	{
		int[] a = new int[4];
		String b = new String(new char[4]);
		for (int z = 1;z <= 5;z++)
		{
			for (int q = 1;q <= 5;q++)
			{
				for (int s = 1;s <= 5;s++)
				{
					for (int l = 1;l <= 5;l++)
					{ //1?2?3?4?5??????????
						if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						{

							if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q))
							{
								a[0] = z;
								a[1] = q;
								a[2] = s;
								a[3] = l;
							b = tangible.StringFunctions.changeCharacter(b, 0, 'z');
							b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 2, 's');
							b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
							for (int i = 0;i < 4;i++)
							{
								for (int j = 0;j < i;j++)
								{
									if (a[i] > a[j])
									{
										int temp;
									temp = a[j];
									a[j] = a[i];
									a[i] = temp;
									char t;
									t = b.charAt(j);
									b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
									b = tangible.StringFunctions.changeCharacter(b, i, t);
									}
								}
							}
							System.out.print(b.charAt(0));
							System.out.print(" ");
							System.out.print(a[0] * 10);
							System.out.print("\n");
							System.out.print(b.charAt(1));
							System.out.print(" ");
							System.out.print(a[1] * 10);
							System.out.print("\n");
							System.out.print(b.charAt(2));
							System.out.print(" ");
							System.out.print(a[2] * 10);
							System.out.print("\n");
							System.out.print(b.charAt(3));
							System.out.print(" ");
							System.out.print(a[3] * 10);
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

