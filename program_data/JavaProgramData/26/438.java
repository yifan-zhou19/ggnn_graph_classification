package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ls;
		int i;
		int word;
		int num;
		String s = new String(new char[100]);
		char[][] s1 = new char[100][100];
		s = new Scanner(System.in).nextLine();
		ls = s.length();
		word = 0;
		num = 0;
		for (i = 0;i < ls;i++)
		{
			if (s.charAt(i) != ' ')
			{
				s1[word][num++] = s.charAt(i);
			}
			else
			{
				while (s.charAt(i) == ' ')
				{
					i++;
				}
				i--;
				s1[word][num] = '\0';
				word++;
				num = 0;
			}
		}
		for (i = 0;i <= word;i++)
		{
		System.out.printf("%s",s1[i]);
		if (i != word)
		{
			System.out.print(" ");
		}
		}


			return 0;
	}
}
