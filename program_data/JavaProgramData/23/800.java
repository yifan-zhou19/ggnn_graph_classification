package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str1 = new char[100][100];
		String str = new String(new char[100]);
		int n;
		int a = 0;
		int b = 0;
		int c;
		int d;
		int i;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				str1[a][b] = str.charAt(i);
				b++;
			}
			if (str.charAt(i) == ' ')
			{
				str1[a][b] = '\0';
				a++;
				b = 0;
			}
		}
		str1[a][b] = '\0';
		for (d = a;d >= 1;d--)
		{
			for (i = 0;;i++)
			{
				if (str1[d][i] != '\0')
				{
					System.out.printf("%c",str1[d][i]);
				}
				if (str1[d][i] == '\0')
				{
					break;
				}
			}
			System.out.print(" ");
		}
		for (i = 0;;i++)
		{
			if (str1[0][i] != '\0')
			{
				System.out.printf("%c",str1[0][i]);
			}
			if (str1[0][i] == '\0')
			{
				break;
			}
		}
	}
}
