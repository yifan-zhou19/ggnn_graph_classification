package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		char[][] words = new char[100][100];
		int count0;
		int count1;
		int j;

		int n;
		int k;
		int i;
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;

		count1 = String.valueOf(words[1]).length();
		count0 = String.valueOf(words[0]).length();

		for (i = 0;i < count1;i++)
		{
			if (words[0][0] == words[1][i])
			{
				for (j = 0;j < count0;j++)
				{
					if (words[0][j] != words[1][i + j])
					{
						break;
					}
					if (j == count0 - 1)
					{
						System.out.printf("%d",i);
						break;
					}
				}
				break;
			}
		}

		return 0;
	}
}

