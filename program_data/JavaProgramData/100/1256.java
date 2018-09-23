package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String t = new String(new char[300]);
		int i;
		int j = 0;
		int k;
		int m;
		final String zm = "abcdefghijklmnopqrstuvwxyz";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
				j++;
			}
		}
		t = tangible.StringFunctions.changeCharacter(t, j, '\0');
		if (t.charAt(0) == '\0')
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;zm.charAt(i) != '\0';i++)
			{
				m = 0;
				for (k = 0;t.charAt(k) != '\0';k++)
				{
					if (zm.charAt(i) == t.charAt(k))
					{
						m++;
					}
				}
				if (m != 0)
				{
					System.out.printf("%c=%d\n",zm.charAt(i),m);
				}
			}
		}
		return 0;
	}
}

