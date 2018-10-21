package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //????????????z,q,s,l,???????????????????a[5]?????????p
		int q;
		int s;
		int l;
		int[] a = new int[5];
		int p;
		String weight = new String(new char[5]); //???????????????
		for (z = 1;z <= 5;z++) //?????????????
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3) //??????????????????
						{
							weight = tangible.StringFunctions.changeCharacter(weight, z, 'z');
						weight = tangible.StringFunctions.changeCharacter(weight, q, 'q');
						weight = tangible.StringFunctions.changeCharacter(weight, s, 's');
						weight = tangible.StringFunctions.changeCharacter(weight, l, 'l');
						a[1] = z;
						a[2] = q;
						a[3] = s;
						a[4] = l;
						for (int j = 1;j < 4;j++)
						{ //?????????????????
						for (int i = 1;i < 5 - j;i++)
						{
							if (a[i] < a[i + 1])
							{
								p = a[i];
							a[i] = a[i + 1];
							a[i + 1] = p;
							}
						}
						}
						for (int i = 1;i < 5;i++) //????????
						{
							System.out.print(weight.charAt(a[i]));
							System.out.print(" ");
							System.out.print(a[i] * 10);
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

