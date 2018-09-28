package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		char[][] str = new char[50][100];
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			len = String.valueOf(str[i]).length();
			p = str[i] + len - 1;
			if (p == 'r')
			{
				str[i][len - 2] = '\0';
			}
			else if (p == 'y')
			{
				str[i][len - 2] = '\0';
			}
			else if (p == 'g')
			{
				str[i][len - 3] = '\0';
			}
			System.out.println(str[i]);
		}
	}
}

