package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_str = new String(new char[501]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char str[501];
		int len;
		int i;
		int j;
		int p;
		int l;
		Main_str = new Scanner(System.in).nextLine();
		for (len = 0;Main_str.charAt(len) != '\0';len++)
		{
			;
		}
		for (l = 2;l <= len;l++)
		{
			for (i = 0;i <= len - l;i++)
			{
				for (j = 0;j < l / 2;j++)
				{
					if (Main_str.charAt(i + j) != Main_str.charAt(i + l - 1 - j))
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto here;
					}
				}
					for (p = i;p < i + l;p++)
					{
						System.out.printf("%c",Main_str.charAt(p));
					}
					System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					here:
					continue;
			}
		}

		return 0;
	}

}
