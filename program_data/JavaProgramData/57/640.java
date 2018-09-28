package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int t;
		String word = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = word.length();
			if (word.charAt(l - 3) == 'i' && word.charAt(l - 2) == 'n' && word.charAt(l - 1) == 'g')
			{
				l -= 3;
			}
			else if (word.charAt(l - 2) == 'e' && word.charAt(l - 1) == 'r')
			{
				l -= 2;
			}
			else if (word.charAt(l - 2) == 'l' && word.charAt(l - 1) == 'y')
			{
				l -= 2;
			}
			for (j = 0;j < l;j++)
			{
				System.out.print(word.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

