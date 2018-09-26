package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[2000]); //??
		String s = new String(new char[2000]);
		char m;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		if (s.length() == w.length())
		{
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				for (k = i;w.charAt(k) != '\0';k++)
				{
					if (s.charAt(i) == w.charAt(k))
					{
						m = w.charAt(k);
						w = tangible.StringFunctions.changeCharacter(w, k, w.charAt(i));
						w = tangible.StringFunctions.changeCharacter(w, i, m);
						break;
					}
				}
			}
			if (strcmp(s,w) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}

		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

