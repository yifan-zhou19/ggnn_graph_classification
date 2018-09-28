package <missing>;

public class GlobalMembers
{
	public static String convert = new String(new char[100]);

	public static int Main()
	{
		int N;
		int l;
		int i;
		int tt;
		String a = new String(new char[10000]);

		convert = tangible.StringFunctions.changeCharacter(convert, 'A', 'T');
		convert = tangible.StringFunctions.changeCharacter(convert, 'T', 'A');
		convert = tangible.StringFunctions.changeCharacter(convert, 'G', 'C');
		convert = tangible.StringFunctions.changeCharacter(convert, 'C', 'G');

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (tt = 1; tt <= N; tt++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  l = a.length();
			  for (i = 0;i < l;i++)
			  {
				  System.out.printf("%c",convert.charAt(a.charAt(i)));
			  }
			  System.out.print("\n");
		}

		return 0;
	}

}

