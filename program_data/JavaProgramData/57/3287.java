package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int LEN;
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] str = new char[50][32];
	for (i = 0;i <= n;i++)
	{
	str[i] = new Scanner(System.in).nextLine();
	}
	for (i = 0;i <= n;i++)
	{
			LEN = String.valueOf(str[i]).length();
	if (str[i][LEN - 3] == 'i' && str[i][LEN - 2] == 'n' && str[i][LEN - 1] == 'g')
	{
				str[i][LEN - 3] = '\0';
	}
			else if ((str[i][LEN - 2] == 'e' && str[i][LEN - 1] == 'r') || (str[i][LEN - 2] == 'l' && str[i][LEN - 1] == 'y'))
			{
				str[i][LEN - 2] = '\0';
			}
	}
	for (i = 0;i <= n;i++)
	{
	System.out.println(str[i]);
	}
	return 0;
	}
}

