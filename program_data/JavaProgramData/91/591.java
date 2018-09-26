package <missing>;

public class GlobalMembers
{
	/**
	* @file		???????.cpp
	* @author	??	1000012792
	* @date		2010.12.15
	*/

	public static int Main()
	{
		int l;
		int i;
		String s = new String(new char[110]); //s[]??????s1[]?s??????
		String s1 = new String(new char[110]);
		s = new Scanner(System.in).nextLine(); //??s[]

		l = s.length(); //?s???
		for (i = 0;i < l - 1;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1)); //???????i???????????i???i+1??i=l??????????
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));

		for (i = 0;i < l;i++)
		{
			System.out.print(s1.charAt(i));
		}
		return 0;
	}
}

