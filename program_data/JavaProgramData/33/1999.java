package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] z = new char[n][N];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		z[i] = tempVar2.charAt(0);
	}
	}
	for (k = 0;k < n;k++)
	{
	i = 0;
	while (z[k][i] != '\0')
	{
	if (z[k][i] == 'T')
	{
		z[k][i] = 'A';
	}
	else if (z[k][i] == 'A')
	{
		z[k][i] = 'T';
	}
	else if (z[k][i] == 'G')
	{
		z[k][i] = 'C';
	}
	else if (z[k][i] == 'C')
	{
		z[k][i] = 'G';
	}
	i++;
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.println(z[i]);
	}
	return 0;
	}
}

