package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static char[][] word = new char[100][100];
	public static String a = new String(new char[1]);

	public static void Main()
	{
		int i = 0;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();

		for (p = str;p - str < str.length();p++)
		{
			if (*p != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, 0, *p);
				word[i] += a;
			}
			else
			{
				i++;
			}
		}

		for (j = i;j > 0;j--)
		{
			System.out.printf("%s ",word[j]);
		}
			System.out.printf("%s",word[0]);
	}
}

