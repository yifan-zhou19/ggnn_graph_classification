package <missing>;

public class GlobalMembers
{
	//??2?N??
	//??????? 
	//?????12.12.20
	public static String s = new String(new char[200]); //?????????
	public static String st = new String(new char[200]);
	public static String sw = new String(new char[200]);
	public static int N;
	public static void multi(int n) //?????2???
	{
		if (n == N)
		{
			return; //?????????
		}
		else
		{
			st = null; //???
			for (int i = 0;i < sw.length();i++)
			{
				st = tangible.StringFunctions.changeCharacter(st, i + 1, (s.charAt(i) * 2 + st.charAt(i)) / 10);
				s = tangible.StringFunctions.changeCharacter(s, i, (s.charAt(i) * 2 + st.charAt(i)) % 10);
				sw = tangible.StringFunctions.changeCharacter(sw, i, 'x');
			} //??????
			s = tangible.StringFunctions.changeCharacter(s, sw.length(), st.charAt(sw.length()));
			sw = tangible.StringFunctions.changeCharacter(sw, sw.length(), 'x');
			multi(n + 1);
		} //????
	}
	public static int Main()
	{
		int p;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = tangible.StringFunctions.changeCharacter(s, 0, 1);
		st = null;
		sw = tangible.StringFunctions.changeCharacter(sw, 0, 'x'); //?????
		multi(0); //????
		for (int i = sw.length();i >= 0;i--)
		{
			s.charAt(i) += '0';
			if (s.charAt(i) != '0')
			{
				p = i;
				break;
			}
		} //?????
		s.charAt(p) -= '0';
		for (int i = p;i >= 0;i--)
		{
			s.charAt(i) += '0';
			System.out.print(s.charAt(i));
		} //??
		return 0;
	}

}

