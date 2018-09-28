package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] s = new char[100][100];
		String string = new String(new char[100]);
		int i;
		int j;
		int m;
		int word;
		int k;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n;i < 100;i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		m = 1;
		for (i = 0;a.charAt(i) != '\0';i++) //??a????m
		{
			if (a.charAt(i) == ' ')
			{
				word = 0;
			}
			else if (word == 0)
			{
				word = 1;
				m++;
			}
		}
			j = 0;
			i = 0;
			k = 0;
			while (a.charAt(i) != '\0') //?a??????string
			{
				while (a.charAt(i) != ' ')
				{
				String[j] = a.charAt(i);
				i++;
				j++;
				if (a.charAt(i) == '\0')
				{
					break;
				}
				}
			String[j] = '\0';
			s[k] = String; //?string?????s[k]
				k++;
				j = 0;
				i++;
			}
		for (k = m - 1;k > 0;k--)
		{
				System.out.printf("%s ",s[k]);
		}
			   System.out.printf("%s",s[0]); //????s[k]

	}
}

