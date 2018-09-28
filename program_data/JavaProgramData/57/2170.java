package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int len;
		char[][] word = new char[100][20];
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d = System.in.read();
		for (i = 0;i < n;i++)
		{
			word[i] = new Scanner(System.in).nextLine();
			d = getchar;
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(word[i]).length();
			if (word[i][len - 1] == 'r' || word[i][len - 1] == 'y')
			{
				word[i][len - 2] = '\0';
				System.out.printf("%s\n",word[i]);
			}
			else
			{
				word[i][len - 3] = '\0';
				System.out.printf("%s\n",word[i]);
			}
		}
	}
}

