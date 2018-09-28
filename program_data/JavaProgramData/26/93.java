package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		int i;
		int j;
		for (i = 0; ;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.print(str[j]);
			System.out.print(" ");
		}
		System.out.print(str[i]);
		System.out.print("\n");
		return 0;
	}
}

