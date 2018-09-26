package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String st = new String(new char[300]);
		String sub = new String(new char[300]);
		String re = new String(new char[300]);
		String c = new String(new char[300]);
		String sz = new String(new char[300]);
		int i;
		int j;
		int k;
		int t;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		for (i = 0;i <= st.length() - sub.length();i++)
		{
			u = 0;
			k = 0;
			t = 0;
			sz = st;
			for (j = i;j <= (i + sub.length() - 1);j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, sz.charAt(j));
				k++;
			}
			c = tangible.StringFunctions.changeCharacter(c, k, '\0');
			if (strcmp(c,sub) == 0)
			{
				for (j = i;j <= (i + sub.length() - 1);j++)
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, re.charAt(t));
					t++;
				}
				System.out.printf("%s",sz);
				u = 1;
				break;
			}
		}
		if (u == 0)
		{
			System.out.printf("%s",st);
		}
	}
}

