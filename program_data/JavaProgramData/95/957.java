package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-10-19
	 *      Author: Li Wenpeng
	 */
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int s1;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		s1 = a.length(); //????????
		for (i = 0;i <= s1;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32); //???????
			}
			if ((b.charAt(i) >= 'a') && (b.charAt(i) <= 'z'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32); //???????
			}
			if (a.charAt(i) - b.charAt(i) == 0)
			{
				continue;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				System.out.print("\n");
				return 0;
			} //????????????????
			else
			{
				System.out.print('<');
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print('=');
		System.out.print("\n");
		return 0;
	}

}

