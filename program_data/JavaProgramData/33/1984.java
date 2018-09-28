package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		do
		{
			String s = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int k;
			int len;
			len = s.length();
			for (k = 0;k < len;k++)
			{
				if (s.charAt(k) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) - 'A'+'T');
				}
				else if (s.charAt(k) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) - 'T'+'A');
				}
				else if (s.charAt(k) == 'G')
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) - 'G'+'C');
				}
				else if (s.charAt(k) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) - 'C'+'G');
				}
			}
			System.out.printf("%s\n",s);
			i++;
		}while (i < n);
		return 0;
	}
}

