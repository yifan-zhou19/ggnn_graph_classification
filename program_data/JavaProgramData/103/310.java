package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		for (int i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, (char)(str.charAt(i) + 'A'-'a'));
			}
		}
		char als;
		als = str.charAt(0);
		int aln = 0;
		for (int i = 0;i < len;i++)
		{
				if (str.charAt(i) == als)
				{
					aln++;
				}
				else
				{
					System.out.print("(");
					System.out.print(als);
					System.out.print(",");
					System.out.print(aln);
					System.out.print(")");
					als = str.charAt(i);
					aln = 1;
				}
		}
		System.out.print("(");
		System.out.print(als);
		System.out.print(",");
		System.out.print(aln);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}

}

