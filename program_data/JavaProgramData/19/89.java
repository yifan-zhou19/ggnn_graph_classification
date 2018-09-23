package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
	int i;
	int j = 0;
		for (i = 0;i < 100;i++)
		{
			j += scanf("%s",str[i]);
			if (str[i][0] < 2)
			{
				break;
			}

		}

	for (i = 0;i < 100;i++)
	{
		if (strcmp(str[i],str[j - 1]) == 0)
		{
			str[i] = str[j];
		}
	}
	for (i = 0;i < j - 2;i++)
	{
		System.out.printf("%s ",str[i]);
	}
	System.out.printf("%s",str[j - 2]);
	return 0;
	}
}
