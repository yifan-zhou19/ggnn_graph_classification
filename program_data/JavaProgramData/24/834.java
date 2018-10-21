package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][100];
		String input = new String(new char[5000]);
		input = new Scanner(System.in).nextLine();
		int i;
		int k = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		int n = input.length();
		for (i = 0;i < n;i++)
		{
			if (input.charAt(i) == ' ')
			{
				word[k][j] = '\0';
				k++;
				j = 0;
				continue;
			}
			word[k][j] = input.charAt(i);
			j++;
		}
		word[k][j] = '\0';
		int max = String.valueOf(word[0]).length();
		int min = String.valueOf(word[0]).length();
		for (i = 1;i <= k;i++)
		{
			if ((int)String.valueOf(word[i]).length() > max)
			{
				max = (int)String.valueOf(word[i]).length();
				a = i;
			}
		}
		for (i = 1;i <= k;i++)
		{
			if ((int)String.valueOf(word[i]).length() < min)
			{
				min = (int)String.valueOf(word[i]).length();
				b = i;
			}
		}
		System.out.printf("%s\n",word[a]);
		System.out.printf("%s\n",word[b]);
		return 0;
	}

}
