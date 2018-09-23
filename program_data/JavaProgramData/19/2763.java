package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char[][] word = new char[51][20];
		String word1 = new String(new char[20]);
		String word2 = new String(new char[20]);

		str = new Scanner(System.in).nextLine();
		word1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		word2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int point;
		int i;
		int counter;
		counter = 1;
		i = 0;
		for (point = 0;str.charAt(point) != '\0';point++)
		{
			if (str.charAt(point) == ' ')
			{
				word[counter][i] = '\0';
				counter++;
				i = 0;
			}
			else
			{
				word[counter][i] = str.charAt(point);
				i++;
			}
		}
		word[counter][i] = '\0';

		int k;
		for (k = 1;k <= counter;k++)
		{
			int flag = 0;
			for (i = 0;word1.charAt(i) != '\0';i++)
			{
				if (word[k][i] != word1.charAt(i))
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print(word2);
			}
			else
			{
				System.out.print(word[k]);
			}
			if (k != counter)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

