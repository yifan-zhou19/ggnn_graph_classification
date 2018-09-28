package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];

		int j;
		int i;
		int c;
		for (i = 0; i < 100; i++)
		{ //?????
			for (j = 0; j < 100; j++)
			{
				str[i][j] = 'x';
			}

		}
		i = 0;
		str[i++] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while ((c = System.in.read()) != '\n') //????
		{
			str[i++] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		i--;
		while (i > 0) //??????
		{
			System.out.print(str[i--]);
			System.out.print(' ');
		}
		System.out.print(str[0]);
		return 0;
	}
}

