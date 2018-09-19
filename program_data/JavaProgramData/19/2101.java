package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);


		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = s;
		while (*p2 != '\0')
		{
			int i = 0;
			String temp = new String(new char[100]);
			for (i = 0;i <= 99;i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			}
			i = 0;
			do
			{
			temp = tangible.StringFunctions.changeCharacter(temp, i, *p2);
			p2++;
			i++;
			} while (*p2 != ' ' && *p2 != '\0');
			if (strcmp(s1,temp) == 0)
			{
				System.out.printf("%s",s2);
			}
			else
			{
				System.out.printf("%s",temp);
			}
			if (*p2 == ' ')
			{
				p2++;
				System.out.print(" ");
			}

		}
		return 0;
	}

}

