package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len; //l&Icirc;&ordf;&Ecirc;&auml;&Egrave;&euml;&micro;&Auml;�&Ouml;�&ucirc;&acute;&reg;&sup3;�&para;&Egrave;
		int j;
		int a = 1;
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		//scanf("%d",&l);
		for (int i = 0;i < len;i = i + a)
		{
			a = 1;
			for (j = i;j < len;j++)
			{
				if (s.charAt(j) == s.charAt(j + 1) || s.charAt(j) == s.charAt(j + 1) - 'a'+'A' || s.charAt(j + 1) == s.charAt(j) - 'a'+'A')
				{
					a++;
				}
				else
				{
					break;
				}
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			}
			System.out.printf("(%c,%d)",s.charAt(i),a);

		}

	}
}

