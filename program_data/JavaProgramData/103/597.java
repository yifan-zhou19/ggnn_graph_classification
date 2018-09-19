package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 97)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i + 1) == s.charAt(i))
			{
				j++;
			}
			else
			{
				System.out.printf("(%c,%d)",s.charAt(i),j);
				j = 1;
			}
		}
	}

}

