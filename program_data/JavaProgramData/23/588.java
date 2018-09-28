package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[100][100];
		char gt;
		int m;
		for (int i = 0;i < 100;i++)
		{
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			gt = System.in.read();
			if (gt == '\n')
			{
				m = i;
				break;
			}
		}
		for (int i = m;i > 0;i--)
		{
			System.out.print(words[i]);
			System.out.print(' ');
		}
		System.out.print(words[0]);
		return 0;
	}

}

