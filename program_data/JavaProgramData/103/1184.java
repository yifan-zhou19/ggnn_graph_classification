package <missing>;

public class GlobalMembers
{
	public static void str(String s)
	{
		int i;
		for (i = 0;s[i] != null;i++)
		{
			if (('a' <= s[i]) && (s[i].compareTo('z') <= 0))
			{
				s[i] = s[i] - 'a'+'A';
			}
		}
		return;
	}

	public static int Main()
	{
		String s = new String(new char[1001]);
		int i;
		int j;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}

		str(s);

		for (i = 0;s.charAt(i);i = j)
		{

				n = 1;
				for (j = i + 1;s.charAt(j) == s.charAt(i);j++)
				{
					n++;
					s = tangible.StringFunctions.changeCharacter(s, j, 'a');
				}
				System.out.printf("(%c,%d)",s.charAt(i),n);

		}

		return 0;
	}
}

