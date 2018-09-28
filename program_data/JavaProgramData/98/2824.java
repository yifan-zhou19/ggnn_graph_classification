package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] inp = new char[500][50];
		int[] len = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			inp[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(inp[i]).length();
		}
		int l = 80;
		for (i = 0;i < n;i++)
		{
			if (l < len[i])
			{
				System.out.print("\n");
				l = 80;
			}
			if (l != 80)
			{
				System.out.print(" ");
			}
			System.out.print(inp[i]);
			l = l - 1 - len[i];
		}
		return 0;
	}

}

