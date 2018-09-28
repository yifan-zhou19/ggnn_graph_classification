package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String w = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			for (k = 0;w.charAt(k) != '\0';k++)
			{
			}
			if (w.charAt(k - 1) == 'r' || w.charAt(k - 1) == 'y')
			{
				w = tangible.StringFunctions.changeCharacter(w, k - 2, '\0');
			}
			else
			{
				w = tangible.StringFunctions.changeCharacter(w, k - 3, '\0');
			}
			System.out.printf("%s\n", w);
		}
		return 0;
	}


}

