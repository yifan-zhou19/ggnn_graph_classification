package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int b;
		int c;
		int n;
		int m;
		char[][] string = new char[100][100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			String[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
		for (b = 0;string[i][b] != '\0';b++)
		{
		for (c = 0;string[i][c] != '\0';c++)
		{
		if (c != b)
		{
		if (String[i][c] == string[i][b])
		{
		 m = 0;
		break;
		}
		else
		{
			m = 1;
		}
		}
		}
		if (m == 1)
		{
		System.out.printf("%c\n",string[i][b]);
		break;
		}
		}
		if (m == 0)
		{
		System.out.print("no\n");
		}
		}

	}

}

