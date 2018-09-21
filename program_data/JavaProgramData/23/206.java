package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ls;
		int i;
		int num;
		int sk;
		int lk;
		int word;
		char[][] kong = new char[100][100];
		char[][] s1 = new char[100][100];
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		ls = s.length();
		sk = 0;
		num = 0;
		word = 0;
		lk = 0;
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
					kong[lk][sk++] = s.charAt(i);
					i++;
				}
				kong[lk][sk++] = '\0';
				lk++;
				sk = 0;
				s1[word][num] = '\0';
					word++;
					num = 0;
					i--;
			}

		}
		for (i = word;i >= 0;i--)
		{
			System.out.printf("%s",s1[i]);
			if (i != 0)
			{
				System.out.printf("%s",kong[i - 1]);
			}
		}


		return 0;



	}

}
