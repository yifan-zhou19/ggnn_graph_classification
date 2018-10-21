package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */

	public static int Main()
	{
	   int z; //????????
	   int q;
	   int s;
	   int l;
	   int i;
	   int j;
	   int m;
	   String a = new String(new char[6]); //???????????
	   for (z = 1;z <= 5;z++)
	   { //?4?????
		   for (q = 1;q <= 5;q++)
		   {
			   if (z == q)
			   {
				   continue;
			   }
			   for (s = 1;s <= 5;s++)
			   {
				   if (s == z || s == q)
				   {
					   continue;
				   }
				   for (l = 1;l <= 5;l++)
				   {
					   if (l == z || l == q || l == s)
					   {
						   continue;
					   }
					   if ((z + q == s + l) && ((z + l) > (s + q)) && ((z + s) < q)) //?????
					   {
							   a = tangible.StringFunctions.changeCharacter(a, z, 'z'); //???????????
						   a = tangible.StringFunctions.changeCharacter(a, q, 'q');
						   a = tangible.StringFunctions.changeCharacter(a, s, 's');
						   a = tangible.StringFunctions.changeCharacter(a, l, 'l');

						   for (i = 0;i <= 5;i++)
						   {
				  if ((i != z) && (i != q) && (i != s) && (i != l))
				  {
					  m = i;
				  }
						   }

					 for (j = 5;j >= 1;j--)
					 { //??????
					 if (j == m)
					 {
						 continue;
					 }
					 System.out.print(a.charAt(j));
					 System.out.print(" ");
					 System.out.print(j * 10);
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

