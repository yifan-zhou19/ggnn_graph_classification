package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String tmp = new String(new char[105]);
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0,j = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
				j = 0;
				if (strcmp(a,tmp) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",tmp);
				}
			}
			else
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, s.charAt(i));
				j++;

			}
		}
		tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
		if (strcmp(a,tmp) == 0)
		{
					System.out.printf("%s\n",b);
		}
				else
				{
					System.out.printf("%s\n",tmp);
				}
		return 0;
	}
}

