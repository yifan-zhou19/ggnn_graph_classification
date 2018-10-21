package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] str = new char[1000][256];
		String num = new String(new char[12]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
						 *(str + i) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
						for (j = 0;str[i][j] != '\0';j++)
						{
													 if (str[i][j] == 'A' || str[i][j] == 'T')
													 {
														System.out.printf("%c",149 - str[i][j]);
													 }
													 else
													 {
														System.out.printf("%c",138 - str[i][j]);
													 }
						}
						System.out.print("\n");
		}

		return 0;
	}
}
