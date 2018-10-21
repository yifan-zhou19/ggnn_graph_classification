package <missing>;

public class GlobalMembers
{
	//*********************************************************************
	//*????weight.cpp                                                 *
	//*?  ??spica                                                      *
	//*?????2011?11?                                               *
	//*????:????????????????????????????  *
	//*********************************************************************
	public static int Main()
	{
		int z = 0; //??????????z,q,s,l???????w
		int q = 0;
		int s = 0;
		int l = 0;
		int w = 0;
		int i = 0; //??????i,j6
		int j = 0;
		String weight = new String(new char[6]); //??????weight[]
		for (i = 1;i <= 5;i++) //??????????
		{
			weight = tangible.StringFunctions.changeCharacter(weight, i, ' ');
		}
		for (z = 1;z <= 5;z++) //z???1�5??
		{
			for (q = 1;q <= 5;q++) //q???1�5??
			{
				if (z == q) //z=q,??
				{
					continue;
				}
				for (s = 1;s <= 5;s++) //s?1�5??
				{
					if (z == s || q == s) //z=s?q=s,??
					{
						continue;
					}
					for (l = 1;l <= 5;l++) //l?1�5??
					{
						if (z == l || s == l || q == l) //z=l?q=l?s=l??
						{
							continue;
						}
						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q) //?????????????????
						{
							weight = tangible.StringFunctions.changeCharacter(weight, z, 'z');
							weight = tangible.StringFunctions.changeCharacter(weight, q, 'q');
							weight = tangible.StringFunctions.changeCharacter(weight, s, 's');
							weight = tangible.StringFunctions.changeCharacter(weight, l, 'l');
							for (j = 5;j >= 1;j--) //??????????
							{
								if (weight.charAt(j) != ' ')
								{
									w = j * 10;
									System.out.print(weight.charAt(j));
									System.out.print(" ");
									System.out.print(w);
									System.out.print("\n");
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

