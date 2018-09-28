package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][80];
		int i;
		int n;
		int l1;
		int l2;
		int aa = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		i = 0;
		while (i != n - 1)
		{
			l1 = String.valueOf(word[i]).length();
			l2 = String.valueOf(word[i + 1]).length();
			if ((aa + l1 + l2 + 1 > 80) && (aa + l1 <= 80))
			{
				System.out.print(word[i]);
				System.out.print("\n");
				aa = 0;
				i++;
			}
			else
			{
				System.out.print(word[i]);
				System.out.print(" ");
				aa = aa + l1 + 1;
				i++;
			}
		}
		if (aa + l2 <= 80)
		{
			System.out.print(word[n - 1]);
		}
		else
		{
			System.out.print("\n");
			System.out.print(word[n - 1]);
		}
		return 0;
	}
}

