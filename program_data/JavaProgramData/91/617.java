package <missing>;

public class GlobalMembers
{
	//??????????
	//???2010.12.18
	//??????
	//???1000012856

	public static int Main()
	{
		String s = new String(new char[101]); //s?????????s1???????
		String s1 = new String(new char[100]);
		int i; //i?????l?s???
		int l;
		s = new Scanner(System.in).nextLine(); //??s
		l = s.length();
		for (i = 0; i < l - 1; i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1)); //??????????????s1
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, l - 1, s.charAt(l - 1) + s.charAt(0)); //???s1????
		for (i = 0; i < l; i++)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}


}

