package <missing>;

public class GlobalMembers
{
	public static char change(char s)
	{
		if (s >= 'A' && s <= 'Z')
		{
			s = s - 'A'+'a';
		}
		return s;
	}

	public static int Main()
	{
		char[][] c = new char[2][80];
		int i;
		int j;
		for (j = 0;j < 2;j++)
		{
			c[j] = new Scanner(System.in).nextLine();
		}
		for (j = 0;j < 2;j++)
		{
		for (i = 0;c[j][i] != '\0';i++)
		{
			c[j][i] = change(c[j][i]);
		}
		}
		if (strcmp(c[0],c[1]) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(c[0],c[1]) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
	}
}
