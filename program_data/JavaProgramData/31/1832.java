package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] s = new char[1024][128];
	int i = 0;

	while (gets(s[i]))
	{
	if (strcmp(s[i],"end") == 0)
	{
		break;
	}
	i++;
	}

	while (i != 0)
	{
	i--;
	System.out.println(s[i]);
	}
	}
}
