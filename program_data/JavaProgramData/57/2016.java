package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a;
		String w = new String(new char[100]);
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
			a = w.length();
			if (((w.charAt(a - 1) == 'r') && (w.charAt(a - 2) == 'e')) || ((w.charAt(a - 1) == 'y') && (w.charAt(a - 2) == 'l')))
			{
				w = tangible.StringFunctions.changeCharacter(w, a - 2, '\0');
				System.out.printf("%s\n",w);
			}
			else if ((w.charAt(a - 3) == 'i') && (w.charAt(a - 2) == 'n') && (w.charAt(a - 1) == 'g'))
			{
				w = tangible.StringFunctions.changeCharacter(w, a - 3, '\0');
				System.out.printf("%s\n",w);
			}
		}

	}




}

