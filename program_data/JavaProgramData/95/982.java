package <missing>;

public class GlobalMembers
{
	/*
	 * 15.cpp
	 *Created on: 2011-10-26
	 *Author: gaokai
	 *??????????????
	 */


	public static int Main()
	{
		int i; //??????
		String a = new String(new char[80]); //a????????,b????????
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine(); //?????????
		for (i = 0;i < (int)a.length();i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, Character.toLowerCase(a.charAt(i)));
		}
		for (i = 0;i < (int)b.length();i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, Character.toLowerCase(b.charAt(i))); //????????????
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}

}

