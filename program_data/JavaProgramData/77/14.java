package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char boy;
		char girl;
		char null_Renamed;
		int i;
		int j;
		int l;
		null_Renamed = '0';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		boy = s.charAt(0);
		for (i = 0; i < l; i++)
		{
			if (s.charAt(i) != s.charAt(0))
			{
				girl = s.charAt(i);
				break;
			}
		}
		for (i = 0; i < l; i++)
		{
			if (s.charAt(i) != null_Renamed)
			{
				if (s.charAt(i) == girl)
				{
					for (j = i - 1; j >= 0; j--)
					{
						if (s.charAt(j) == boy)
						{
							System.out.printf("%d %d\n", j, i);
							s = tangible.StringFunctions.changeCharacter(s, i, null_Renamed);
							s = tangible.StringFunctions.changeCharacter(s, j, null_Renamed);
							break;
						}
					}
				}
			}
		}
		return 0;
	}
}

