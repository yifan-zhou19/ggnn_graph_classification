package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		String w = new String(new char[102]);
		int i;
		int ls;
		s = new Scanner(System.in).nextLine();

		ls = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(w,0,(Character.SIZE / Byte.SIZE));

		for (i = 0;i < ls;i++)
		{
						  if (i < ls - 1)
						  {
									  w = tangible.StringFunctions.changeCharacter(w, i, s.charAt(i) + s.charAt(i + 1));
						  }
						  else if (i == ls - 1)
						  {
							   w = tangible.StringFunctions.changeCharacter(w, ls - 1, s.charAt(ls - 1) + s.charAt(0));
						  }
		}

		System.out.println(w);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return 0;

	}
}

