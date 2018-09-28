package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] input = new char[500][200];
		char letter;
		int row;
		int i;
		int j;
		for (i = 0;i < 500;i++)
		{
			for (j = 0;j < 200;j++)
			{
				input[i][j] = '\0';
			}
		}
		i = 0;
		j = 0;
	   while (true)
	   {

			letter = System.in.read();
			if (letter != ' ' && letter != '\n')
			{
				input[i][j] = letter;
				j++;
			}
			else if (letter == ' ')
			{
				i++;
				j = 0;
			}
			if (letter == '\n')
			{
				row = i;
				break;
			}
	   }

	   int[] LEN = new int[500];
	   for (i = 0;i < row;i++)
	   {
		   LEN[i] = String.valueOf(input[i]).length();
		   if (LEN[i] != 0)
		   {
		   System.out.printf("%d,",LEN[i]);
		   }
	   }
	   LEN[row] = String.valueOf(input[row]).length();
	   System.out.printf("%d",LEN[row]);

		return 0;
	}
}
