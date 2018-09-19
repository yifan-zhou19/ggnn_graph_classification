package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String Sen = new String(new char[200]);
		String word = new String(new char[200]);
		String exchange = new String(new char[200]);
		String temp = new String(new char[200]);
		Sen = new Scanner(System.in).nextLine();
		word = new Scanner(System.in).nextLine();
		exchange = new Scanner(System.in).nextLine();
		int n = Sen.length();
		int i;
		int m;
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (Sen.charAt(i) != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, m, Sen.charAt(i));
				m++;
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, m, '\0');
				if (strcmp(temp,word) == 0)
				{
					System.out.printf("%s ",exchange);
				}
				else
				{
					System.out.printf("%s ",temp);
				}
				m = 0;
			}
			if (i == n - 1)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, m, '\0');
				if (strcmp(temp,word) == 0)
				{
					System.out.printf("%s\n",exchange);
				}
				else
				{
					System.out.printf("%s\n",temp);
				}
				m = 0;
			}

		}
	}

}

