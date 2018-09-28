package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	int n;
	int i = 1;
	int j;

	char[][] str = new char[51][32];
	char t;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	while (i <= n)

	{






	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str[i] = tempVar2.charAt(0);
	}









	i++;

	}


	for (i = 1;i <= n;i++)

	{






	for (j = 1;j <= 32;j++)


	{



	if (str[i][j] == 'e' && str[i][j + 1] == 'r' && str[i][j + 2] == '\0')
	{




	str[i][j] = '\0';
	}



	else if (str[i][j] == 'l' && str[i][j + 1] == 'y' && str[i][j + 2] == '\0')
	{




	str[i][j] = '\0';
	}



	else if (str[i][j] == 'i' && str[i][j + 1] == 'n' && str[i][j + 2] == 'g' && str[i][j + 3] == '\0')
	{




	str[i][j] = '\0';
	}


	}





	}


	for (i = 1;i <= n;i++)

	{

	System.out.printf("%s\n",str[i]);

	}
	}


}

