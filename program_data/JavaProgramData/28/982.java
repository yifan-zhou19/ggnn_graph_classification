package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[999999]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		int n = 0;
		int k = 0;
		char[][] words = new char[300][100];
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				words[n][k] = str.charAt(i);
				k++;
			}
			else if (str.charAt(i - 1) != ' ' && str.charAt(i) == ' ')
			{
				words[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		words[n][k] = '\0';
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",String.valueOf(words[i]).length());
		}
		System.out.printf("%d",String.valueOf(words[n]).length());
		return 0;
	}
}
