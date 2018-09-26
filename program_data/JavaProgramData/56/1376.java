package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int a;
		String n = new String(new char[5]);
		String w = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		a = (int)n.length();
		for (i = a - 1;i >= 0;i--)
		{

				w = tangible.StringFunctions.changeCharacter(w, j, n.charAt(i));
				j++;
		}
		w = w.substring(0, j);

		System.out.printf("%s",w);
		return 0;
	}
}

