package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int len;
		int i;
		int row = 1;
		int col = 1;
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 1;i <= len;i++)
		{
			if (str.charAt(i - 1) == ' ')
			{
				row++;
				col = 1;
			}
			else
			{
				word[row - 1][col - 1] = str.charAt(i - 1);
				col++;
			}
		}
			for (i = 1;i <= row;i++)
			{
				if (strcmp(word[i - 1],str1) == 0)
				{
					word[i - 1] = str2;
				}
			}
			System.out.printf("%s",word[0]);
			for (i = 2;i <= row;i++)
			{
				System.out.printf(" %s",word[i - 1]);
			}
			return 0;
	}





}
