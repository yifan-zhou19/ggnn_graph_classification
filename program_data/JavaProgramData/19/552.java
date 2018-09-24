package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[100]);
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String pre = new String(new char[20]);
		String post = new String(new char[20]);
		int i;
		int l;
		int[] f = new int[50];
		int[] g = new int[50];
		int word_num = 0;
		int char_num = 0;
		sen = new Scanner(System.in).nextLine();
		pre = new Scanner(System.in).nextLine();
		post = new Scanner(System.in).nextLine();
		l = sen.length();
		for (i = 0;i < l;i++)
		{
			if (sen.charAt(i) != ' ')
			{
				word[word_num][char_num] = sen.charAt(i);
				char_num++;
			}
			else if (sen.charAt(i) == ' ')
			{
				word_num++;
				char_num = 0;
			}
		}
		for (i = 0;i <= word_num;i++)
		{
			f[i] = String.valueOf(word[i]).length();
		}
		for (i = 0;i <= word_num;i++)
		{
			if (strcmp(word[i],pre) == 0)
			{
				word[i] = post;
			}
		}
		for (i = 0;i < word_num;i++)
		{
			System.out.printf("%s",word[i]);
			System.out.print(" ");
		}
		System.out.printf("%s",word[word_num]);
		return 0;
	}
}
