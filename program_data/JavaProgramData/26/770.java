package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] x = new char[100][10];
		int i = 0;
		while ((x[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if (System.in.read() == '\n')
			{
				break;
			}
			i++;
		}
		for (int j = 0;j < i;j++)
		{
			System.out.print(x[j]);
			System.out.print(' ');
		}
		System.out.print(x[i]);
		System.out.print("\n");
		return 0;
	}
}

