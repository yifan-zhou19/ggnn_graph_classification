package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int letter;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[1000][41];
		len = 0;
		letter = 0;
		flag = 0;
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0; i < n; i++)
		{
			if (flag == 1)
			{
				letter++;
			}
			len = String.valueOf(word[i]).length();
			letter += len;
			if (letter > 80)
			{
				System.out.print("\n");
				letter = len;
				flag = 0;
			}
			if (flag == 1)
			{
				System.out.print(" ");
				System.out.print(word[i]);
			}
			else
			{
				System.out.print(word[i]);
				flag = 1;
			}
		}
		return 0;
	}

}

