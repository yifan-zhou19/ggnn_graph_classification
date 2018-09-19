package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][1000];
		String s = new String(new char[1000]);
		int i;
		int j;
		int n;
		int[] a = new int[1000];
		int temp;
		for (i = 0; i < 100; i++)
		{
			str[i][0] = '\0';
		}
		i = 0;
		do
		{
			str[i] = new Scanner(System.in).nextLine();
			if (str[i][0] == '\0')
			{
				break;
			}
			i++;
		}while (1 != 0);
		n = i - 1; //???????n????????
		for (i = 0; i <= n; i++)
		{
			for (j = 0; j < 1000; j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
			}
			temp = 0;
			System.out.printf("%s\n",str[i]);
			for (j = 0; j < (String.valueOf(str[i]).length()); j++)
			{
				if (str[i][j] == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '$');
					temp++;
					a[temp] = j;
				}
				else if (str[i][j] == ')')
				{
					if (temp == 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, '?');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, a[temp], ' ');
						temp--;
						s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					}
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				}
			}
			System.out.printf("%s\n",s);
		}
	}
}

