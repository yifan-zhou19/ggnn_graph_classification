package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		char[][] out = new char[100][100];
		int len = 0;
		int count = 0;
		while (cin.get(ch))
		{
			if (ch == '\n')
			{
				break;
			}
			else if (ch == ' ')
			{
				out[len][count] = '\0';
				len++;
				count = 0;
			}
			else
			{
				out[len][count] = ch;
				count++;
			}
		}
		out[len][count] = '\0';
		for (int i = len; i >= 0; i--)
		{
			System.out.print(out[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		return 0;
	}
}
