package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] str = new char[1000][100];
	char[][] substr = new char[1000][300];
	int i = 0;
	int j;
	int max;
	int m;
	char a;
	while (scanf("%s %s",str[i],substr[i]) != EOF)
	{
	i++;
	}
	m = i;
	for (i = 0;i < m;i++)
	{
		a = str[i][0];
	for (j = 0;str[i][j] != '\0';j++)
	{
		if (str[i][j] > a)
		{
			a = str[i][j];
			max = j;
		}
	}
	for (j = 0;j <= max;j++)
	{
	System.out.printf("%c",str[i][j]);
	}
	for (j = 0;j < 3;j++)
	{
	System.out.printf("%c",substr[i][j]);
	}
	for (j = max + 1;str[i][j] != '\0';j++)
	{
	System.out.printf("%c",str[i][j]);
	}
	System.out.print("\n");
	}
		return 0;
	}
}
