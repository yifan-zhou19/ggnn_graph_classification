package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	int i;
	int n;
	int m;
	int j;
	char[][] s1 = new char[10000][256];
	char[][] s2 = new char[10000][256];
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
		s1[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	m = String.valueOf(s1[i]).length();
	for (j = 0;j < m;j++)
	{
	if (s1[i][j] == 'A')
	{
	s2[i][j] = 'T';
	}
	else if (s1[i][j] == 'G')
	{
	s2[i][j] = 'C';
	}
	else if (s1[i][j] == 'T')
	{
	s2[i][j] = 'A';
	}
	else if (s1[i][j] == 'C')
	{
	s2[i][j] = 'G';
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	m = String.valueOf(s1[i]).length();
	for (j = 0;j < m;j++)
	{
	System.out.printf("%c",s2[i][j]);
	}
	System.out.print("\n");
	}
	return 0;
	 }
}

