package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[1000]);
		char temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
		int t;
		int len = st.length();
		int i;
		int x = 0;
		for (t = 0;t < len;t++)
		{
			if (st.charAt(t) >= 'a' && st.charAt(t) <= 'z')
			{
				st = tangible.StringFunctions.changeCharacter(st, t, st.charAt(t) - 'a'+'A');
			}
		}
		for (t = 0;x < len;t++)
		{
			temp = st.charAt(x);
			for (i = 0;;i++)
			{
				if (st.charAt(x + i) != st.charAt(x + i + 1))
				{
					break;
				}
			}
			System.out.printf("(%c,%d)",st.charAt(x),i + 1);
			x = x + i + 1;
		}
		return 0;
	}
}

