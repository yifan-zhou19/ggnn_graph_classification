package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static String b = new String(new char[1000]);
	public static String c = new String(new char[1000]);
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1;
		int len2;
		int p = 0;
		int i;
		int j;
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len1 - len2 + 1;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				p = 1;
				for (j = i;j < len2 + i;j++)
				{
					if (a.charAt(j) != b.charAt(j - i))
					{
						p = 0;
						break;
					}
				}
				if (p == 1)
				{
					for (j = i;j < len2 + i;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(j - i));
					}
					break;
				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;


	}



}

