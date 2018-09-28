package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[105]);
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int words = 0;
		char[][] word = new char[50][20];
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) != ' ')
			{
				word[words][j] = str.charAt(i);
				i++;
				j++;
			}
			else
			{
				word[words][j] = '\0';
				words++;
				i++;
				j = 0;
			}
		}
		word[words][j] = '\0';
		for (i = words;i > 0;i--)
		{
			System.out.print(word[i]);
			System.out.print(" ");
		}
		System.out.print(word[0]);
		System.out.print("\n");
		return 0;
	}
}
