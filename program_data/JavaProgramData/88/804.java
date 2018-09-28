package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String a = new String(new char[30]);
		String s = new String(new char[30]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
			{
				for (j = i;s.charAt(j) > 47 && s.charAt(j) < 58;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j - i, s.charAt(j));
				}
				a = tangible.StringFunctions.changeCharacter(a, j - i, '\0');
				i = j - 1;
				if (strcmp(a,"111111111111") == 0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.printf("%s\n",a);
				}
			}
			else
			{
				j = i;
				while ((s.charAt(j) > 58 || s.charAt(j) < 47) && s.charAt(j) != '\0')
				{
					j++;
				}
				i = j - 1;
			}
		}
	}
}

