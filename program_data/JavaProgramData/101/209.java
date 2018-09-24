package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?11?17
	* @description
	* ??????: ??? 
	*/
	public static int Main()
	{
		int a; //????
		int b;
		int c;
		int[] l = new int[3];
		String p = new String(new char[2]); //??????
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++) //?? ??
				{
					if (a != b && b != c && a != c) //?????
					{
					l[a] = (b > a) + (c == a);
					l[b] = (a > b) + (a > c);
					l[c] = (c > b) + (b > a); //????????
					if (l[0] > l[1] && l[1] > l[2]) //?????
					{
						p = tangible.StringFunctions.changeCharacter(p, a, 'A');
						p = tangible.StringFunctions.changeCharacter(p, b, 'B');
						p = tangible.StringFunctions.changeCharacter(p, c, 'C');
						System.out.print(p.charAt(0));
						System.out.print(p.charAt(1));
						System.out.print(p.charAt(2));
					}
					}
				}
			}
		}
				return 0;
	}
}

