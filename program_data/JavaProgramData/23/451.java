package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[MAX][50];
		char m = 'i';
		int LEN = 0;
		while (m != '\n')
		{
			words[LEN] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			LEN++;
			cin.get(m);
		}
		for (int i = 0;i < LEN - 1;i++)
		{
			System.out.print(words[LEN - i - 1]);
			System.out.print(' ');
		}
		System.out.print(words[0]);
		return 0;
	}
}

