package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[5000]);
		sentence = new Scanner(System.in).nextLine();
		char[][] word = new char[50][100];
		int i;
		int k = 0;
		int n = 0;
		int len;
		len = sentence.length();
		for (i = 0;i < len;i++)
		{
			if (sentence.charAt(i) != ' ')
			{
				word[n][k] = sentence.charAt(i);
				k++;
			}
			else
			{
				word[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		word[n][k] = '\0';
		int max = 0;
		int min = 0;
		for (i = 0;i < n + 1;i++)
		{
			if (String.valueOf(word[i]).length() < String.valueOf(word[min]).length())
			{
				min = i;
			}
			if (String.valueOf(word[i]).length() > String.valueOf(word[max]).length())
			{
				max = i;
			}
		}
		System.out.println(word[max]);
		System.out.println(word[min]);
		return 0;
	}
}
