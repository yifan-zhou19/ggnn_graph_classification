package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int z; //z,q,s,l????????????????
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++) //?????????????????
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l) && (z + q == s + l) && (z + l > s + q) && (z + s < q)) //?????????? ??????????
						{
							int[] a = new int[4]; //a?????????t???????
							int t;
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							final String b = "zqsl"; //???b???????????????
							char temp;
							for (int i = 1;i < 4;i++) //???????????????????????
							{
								for (int j = 0;j < i;j++)
								{
									if (a[j] < a[i])
									{
										t = a[i];
										a[i] = a[j];
										a[j] = t;

										temp = b.charAt(i);
										b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
										b = tangible.StringFunctions.changeCharacter(b, j, temp);
									}
								}
							}
							for (int i = 0;i < 4;i++)
							{ //??????????
								System.out.print(b.charAt(i));
								System.out.print(" ");
								System.out.print(a[i] * 10);
								System.out.print("\n");
							}
							return 0; //????????
						}
					}
				}
			}
		}

		return 0;
	}


}

