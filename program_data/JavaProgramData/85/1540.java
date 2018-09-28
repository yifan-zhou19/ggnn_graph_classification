package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String str = new String(new char[21]);
		String temp = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			if (((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')) || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) || (str.charAt(0) == '_'))
			{
				temp = tangible.StringFunctions.changeCharacter(temp, 0, str.charAt(0));
				for (j = 1;str.charAt(j) != '\0';j++)
				{
					if (((str.charAt(j) >= 'a') && (str.charAt(j) <= 'z')) || ((str.charAt(j) >= 'A') && (str.charAt(j) <= 'Z')) || ((str.charAt(j) >= '0') && (str.charAt(j) <= '9')) || (str.charAt(j) == '_'))
					{
						   temp = tangible.StringFunctions.changeCharacter(temp, j, str.charAt(j));
					}
					else
					{
						temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
					}
				}
				temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
				if (strcmp(temp,str) == 0)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}





}

