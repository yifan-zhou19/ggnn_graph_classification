package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int flag = 0;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String temp = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (flag == 1 && s.charAt(i) != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, s.charAt(i));
				j = j + 1;
			}
			else if (flag == 0 && s.charAt(i) != ' ')
			{
				flag = 1;
				j = 0;
				temp = tangible.StringFunctions.changeCharacter(temp, j, s.charAt(i));
				j = j + 1;
			}
			else if (flag == 1 && s.charAt(i) == ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
				if (strcmp(temp,a) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",temp);
				}
				flag = 0;
				j = 0;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
		if (strcmp(temp,a) == 0)
		{
			System.out.printf("%s\n",b);
		}
		else
		{
			System.out.printf("%s\n",temp);
		}
	   return 0;
	}
}

