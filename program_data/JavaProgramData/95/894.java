package <missing>;

public class GlobalMembers
{
	//?????????????a,?????b???????????????
	//???????b???????????????'\0'
	public static int Main()
	{
		char[][] a = new char[2][80];
		char[][] b = new char[2][80];
		char c;
		int i;
		int j;
		for (i = 0;i < 2;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (j = 0;(c = a[0][j]) != '\0';j++)
		{
			if (c >= 'A' && c <= 'Z')
			{
				b[0][j] = c + 32;
			}
			else
			{
				b[0][j] = c;
			}
		}
		b[0][j] = '\0'; //?????????????????
		for (j = 0;(c = a[1][j]) != '\0';j++)
		{
			if (c >= 'A' && c <= 'Z')
			{
				b[1][j] = c + 32;
			}
			else
			{
				b[1][j] = c;
			}
		}
		b[1][j] = '\0'; //????
		if (strcmp(b[0],b[1]) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(b[0],b[1]) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(b[0],b[1]) == 0)
		{
			System.out.print("=");
		}
		return 0;
	}

}
