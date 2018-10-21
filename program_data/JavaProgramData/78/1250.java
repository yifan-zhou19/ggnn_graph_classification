package <missing>;

public class GlobalMembers
{
	//***************************************************
	//8.cpp ???     ******
	//?? ???  1200018209  ********
	//?? 2012.10.8 ******
	//***************************************************
	public static int Main()
	{
		int z; //??????????????????
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int i;
		int j;
		int t;
		String b = new String(new char[4]); //????????????
		char p;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10) //??????
					{
						if (z + q == s + l && z + l > s + q && z + s < q) //??????????
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							b = tangible.StringFunctions.changeCharacter(b, 0, 'z');
							b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 2, 's');
							b = tangible.StringFunctions.changeCharacter(b, 3, 'l'); //?????????????
							for (i = 0;i < 4;i++)
							{
								for (j = i + 1;j < 4;j++)
								{
									if (a[i] < a[j]) //????????????
									{
										t = a[j];
										a[j] = a[i];
										a[i] = t;
										p = b.charAt(j);
										b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
										b = tangible.StringFunctions.changeCharacter(b, i, p); //?????????
									}
								}
							}
						}
					}
				}
			}
		}
		for (i = 0;i < 4;i++)
		{
			System.out.print(b.charAt(i));
			System.out.print(" ");
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

