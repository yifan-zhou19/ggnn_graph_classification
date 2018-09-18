package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[101]);
		String word1 = new String(new char[101]);
		String word2 = new String(new char[101]);
		int[] match = new int[101];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(match, 1, (Integer.SIZE / Byte.SIZE));

		st = new Scanner(System.in).nextLine();
		word1 = new Scanner(System.in).nextLine();
		word2 = new Scanner(System.in).nextLine();

		int len1 = st.length();
		int len2 = word1.length();
		int len3 = word2.length();

		int i;
		int j;
		int k;
		for (i = 0; i < len1; i++)
		{
			if ((i == 0 || st.charAt(i - 1) == ' ') && i + len2 <= len1)
			{
				for (j = 0; j < len2; j++)
				{
					if (st.charAt(i + j) != word1.charAt(j))
					{
						match[i] = 0;
					}
				}
			}
		}

		for (i = 0; i < len1; i++)
		{
			if (match[i] == 0)
			{
				for (j = i; j < len1; j++)
				{
					System.out.print(st.charAt(j));
					if (st.charAt(j) == ' ')
					{
						break;
					}
				}
				i = j;
			}
			else
			{
				i += len2;
				System.out.printf("%s", word2);
				if (i < len1)
				{
					System.out.print(' ');
				}
			}
		}
		System.out.println("");

		return 0;
	}
}
