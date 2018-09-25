package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int z; //z,q,s,l,??????????i?????
		int q;
		int s;
		int l;
		int i;
		String a = new String(new char[6]); //????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE)); //??
		for (z = 10;z <= 50;z += 10)
		{
			for (q = 10;q <= 50;q += 10)
			{
				for (s = 10;s <= 50;s += 10)
				{
					for (l = 10;l <= 50;l += 10)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l && (s != l)))
						{
							a = tangible.StringFunctions.changeCharacter(a, z / 10, 'z');
							a = tangible.StringFunctions.changeCharacter(a, q / 10, 'q');
							a = tangible.StringFunctions.changeCharacter(a, s / 10, 's');
							a = tangible.StringFunctions.changeCharacter(a, l / 10, 'l');
							for (i = 5;i >= 1;i--)
							{
							   if (a.charAt(i) != '\0') //??????????
							   {
								System.out.print(a.charAt(i));
								System.out.print(' ');
								System.out.print(i * 10);
								System.out.print("\n");
							   }
							}
							break;
						}
					}
				}
			}
		}
		return 0;
	}
}

