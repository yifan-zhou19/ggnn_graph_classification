package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		char[][] str = new char[2][80];
		int i;
		int j;
		for (i = 0;i < 2;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			for (j = 0;j < 80;j++)
			{
				if ((str[i][j]) >= 'a' && (str[i][j]) <= 'z')
				{
				(str[i][j]) = (str[i][j]) - 32;
				}
			else
			{
				(str[i][j]) = (str[i][j]);
			}
			}
		}
		if (strcmp(str[0],str[1]) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str[0],str[1]) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(str[0],str[1]) == 0)
		{
			System.out.print("=");
		}

	}


}
