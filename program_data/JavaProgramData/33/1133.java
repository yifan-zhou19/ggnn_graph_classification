package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	char[][] s = new char[1000][300];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < String.valueOf(s[i]).length();j++)
	{
	if (s[i][j] == 'A')
	{
	s[i][j] = 'T';
	}
	else if (s[i][j] == 'T')
	{
	s[i][j] = 'A';
	}
	else if (s[i][j] == 'C')
	{
	s[i][j] = 'G';
	}
	else
	{
	s[i][j] = 'C';
	}
	if (j == String.valueOf(s[i]).length() - 1)
	{
	System.out.printf("%s\n",s[i]);
	}

	}
	}
	return 0;
	}
}

