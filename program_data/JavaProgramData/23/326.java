package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int i = 0;
		char c;
		char[][] st = new char[100][100];
		while (true)
		{
			st[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
			num++;
			c = System.in.read();
			if (c == ' ')
			{
				continue;
			}
			break;
		}
		for (i = num - 1;i > 0;i--)
		{
			System.out.print(st[i]);
			System.out.print(" ");
		}
		System.out.print(st[0]);
		System.out.print("\n");
		return 0;
	}
}

