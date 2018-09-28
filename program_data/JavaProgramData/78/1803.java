package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *  use??????????????????????????
	 *  Created on: 2012-11-5
	 *      Author: lyx
	 */

	public static int Main()
	{
		int z = 0; //????
		int q = 0;
		int s = 0;
		int l = 0;
		int i;
		int j;
		int a1;
		int b1;
		int[] a = new int[6];
		String b = new String(new char[6]);
		for (z = 1;z <= 5;z++) //????????
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
							if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q) //???????????
							{


							a[1] = z; //??????????????
							a[2] = q;
							a[3] = s;
							a[4] = l;
							b = tangible.StringFunctions.changeCharacter(b, 1, 'z'); //??????????
							b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 3, 's');
							b = tangible.StringFunctions.changeCharacter(b, 4, 'l');

						 for (i = 1;i <= 4;i++) //????????????????
						 {
							 for (j = 1;j <= 4 - i;j++)
							 {
								  if (a[j] < a[j + 1])
								  {
									  a1 = a[j]; //????????????????????????
									  a[j] = a[j + 1];
									  a[j + 1] = a1;
									  b1 = b.charAt(j);
									  b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
									  b = tangible.StringFunctions.changeCharacter(b, j + 1, b1);
								  }
							 }
						 }


						 for (i = 1;i <= 4;i++)
						 {
							 System.out.print(b.charAt(i));
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

