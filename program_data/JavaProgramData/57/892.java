package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] str = new char[100][100];
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (str[i][String.valueOf(str[i]).length() - 1] == 'r' && str[i][String.valueOf(str[i]).length() - 2] == 'e')
	{
	str[i][String.valueOf(str[i]).length() - 2] = '\0';
	}
	if (str[i][String.valueOf(str[i]).length() - 1] == 'y' && str[i][String.valueOf(str[i]).length() - 2] == 'l')
	{
	str[i][String.valueOf(str[i]).length() - 2] = '\0';
	}
	if (str[i][String.valueOf(str[i]).length() - 1] == 'g' && str[i][String.valueOf(str[i]).length() - 2] == 'n' && str[i][String.valueOf(str[i]).length() - 3] == 'i')
	{
	str[i][String.valueOf(str[i]).length() - 3] = '\0';
	}
	}

	for (int j = 0;j < n;j++)
	{
	System.out.printf("%s\n",str[j]);
	}

	return 0;
	}
}

