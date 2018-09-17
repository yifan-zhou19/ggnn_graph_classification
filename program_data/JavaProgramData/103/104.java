package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[27];
		String s = new String(new char[1001]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int c = 1;
		int l = s.length();
		for (i = 0;i < l;i++)
		{
						if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
						{
						s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
						}
		}
		for (i = 1;i < l;i++)
		{
						if (s.charAt(i) == s.charAt(i - 1))
						{
							c++;
						}
						else
						{
							System.out.printf("(%c,%d)",s.charAt(i - 1),c);
							c = 1;
						}
		}
		System.out.printf("(%c,%d)",s.charAt(l - 1),c);
		System.in.read();
		System.in.read();
	}
}

