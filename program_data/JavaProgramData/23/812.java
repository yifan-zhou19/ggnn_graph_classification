package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[101]);
		char[][] str = new char[50][100];
		char c;
		int n = 0;
		int i;
		int j;
		int t;
		String = new Scanner(System.in).nextLine();
		t = String.length();
		for (i = 0;i < 50;i++)
		{
			for (j = 0;(c = string.charAt(j + n)) != ' ';j++)
			{
			str[i][j] = string.charAt(j + n);
			}
			n = n + j + 1;
			str[i][j + 1] = '\0';
			if (n > t)
			{
				break;
			}
		}
		for (;i != 0;i--)
		{
			for (j = 0;(c = str[i][j]) != '\0';j++)
			{
			System.out.printf("%c",str[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;(c = str[0][j]) != '\0';j++)
		{
			System.out.printf("%c",str[0][j]);
		}
	}
}
