package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[100]);
	public static int[] line_1 = new int[100];
	public static void paidui()
	{
		int i = 0;
		int m = 0;
		int j = 0;
		if (line.charAt(0) != ' ')
		{
			for (i = 0;m == 0 && line.charAt(i) != '\0';i++)
			{
				if (line.charAt(i) == line.charAt(0))
				{
					for (j = i + 1;line.charAt(j) == ' ';j++)
					{
						;
					}
					if (line.charAt(j) != line.charAt(i))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						line = tangible.StringFunctions.changeCharacter(line, i, ' ');
						line = tangible.StringFunctions.changeCharacter(line, j, ' ');
						m = 1;
					}
				}
			}
		}
		m = 0;
		paidui();
	}
	public static int Main()
	{
		int i = 0;
		for (i = 0;i < 100;i++)
		{
			line_1[i] = i;
		}
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		paidui();
		return 0;
	}
}

