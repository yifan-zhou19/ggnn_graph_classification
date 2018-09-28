package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j = 0;
	char[][] sen = new char[100][100];
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
			sen[i] = tempVar2.charAt(0);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (sen[i][String.valueOf(sen[i]).length() - 1] == 'r' && sen[i][String.valueOf(sen[i]).length() - 2] == 'e')
		{
			sen[i][String.valueOf(sen[i]).length() - 2] = '\0';
		}
		if (sen[i][String.valueOf(sen[i]).length() - 1] == 'y' && sen[i][String.valueOf(sen[i]).length() - 2] == 'l')
		{
			sen[i][String.valueOf(sen[i]).length() - 2] = '\0';
		}
		if (sen[i][String.valueOf(sen[i]).length() - 1] == 'g' && sen[i][String.valueOf(sen[i]).length() - 2] == 'n' && sen[i][String.valueOf(sen[i]).length() - 3] == 'i')
		{
			sen[i][String.valueOf(sen[i]).length() - 3] = '\0';
		}
		if (i != n - 1)
		{
			System.out.printf("%s\n",sen[i]);
		}
		else
		{
			System.out.printf("%s",sen[i]);
		}
	}

	}
}

