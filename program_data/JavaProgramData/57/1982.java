package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int l;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] dc = new char[50][50];

	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		dc[i] = tempVar2.charAt(0);
	}
	l = String.valueOf(dc[i]).length();
	if ((dc[i][l - 2] == 'e') || (dc[i][l - 2] == 'l'))
	{
	dc[i][l - 2] = '\0';
	System.out.printf("%s\n",dc[i]);
	}
	else if (dc[i][l - 3] == 'i')
	{
	dc[i][l - 3] = '\0';
	System.out.printf("%s\n",dc[i]);

	}



	}

	return 0;
	}
}

