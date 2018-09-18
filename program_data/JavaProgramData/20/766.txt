package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] str = new char[20][11];
	char[][] substr = new char[20][4];
	int i = 0;
	int j;
	int n;
	int l;
	int k;
	int h;
	int x;
	int y;
	char a = '\0';
	while (scanf("%s %s",str[i],substr[i]) != EOF)
	{
		scanf("\n");
	i++;
	}
	n = i;
	for (i = 0;i < n;i++)
	{
	l = String.valueOf(str[i]).length();
	for (j = 0;j < l;j++)
	{
	if (str[i][j] > a)
	{
		a = str[i][j];
	}
	}
	k = 0;
	while (str[i][k] != a)
	{
		System.out.printf("%c",str[i][k++]);
	}
	y = k;
	System.out.printf("%c",a);
	for (h = 0;h < 3;h++)
	{
	System.out.printf("%c",substr[i][h]);
	}
	for (x = y + 1;x < l;x++)
	{
	System.out.printf("%c",str[i][x]);
	}
	System.out.print("\n");
	a = '\0';

	}
	return 0;
	}





}
