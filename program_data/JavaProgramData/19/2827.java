package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int k = 0;
		String str = new String(new char[100]);
		String temp = new String(new char[100]);
		String in = new String(new char[100]);
		String out = new String(new char[100]);
		String str0;
		str = new Scanner(System.in).nextLine();
		in = new Scanner(System.in).nextLine();
		out = new Scanner(System.in).nextLine();
		str0 = str;
		x = str.length();
		for (i = 0;i < x;i++)
		{
			if (*(str0.Substring(i)) != ' ' && i != x - 1)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, *(str0.Substring(i)));
				k++;
			}
			else if (*(str0.Substring(i)) == ' ' && i != x - 1)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');
				if (strcmp(temp,in) == 0)
				{
					System.out.printf("%s ",out);
				}
				else
				{
					System.out.printf("%s ",temp);
				}
				k = 0;
			}
			else if (i == x - 1)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, *(str0.Substring(i)));
				temp = tangible.StringFunctions.changeCharacter(temp, k + 1, '\0');
				if (strcmp(temp,in) == 0)
				{
					System.out.printf("%s\n",out);
				}
				else
				{
					System.out.printf("%s\n",temp);
				}
			}
		}
		return (0);
	}
}

