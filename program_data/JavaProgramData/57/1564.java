package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] l = new int[50];
		char[][] str = new char[50][50];
		char[][] t = new char[50][50];
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
			str[i] = tempVar2.charAt(0);
		}
		l[i] = String.valueOf(str[i]).length();

		if (str[i][l[i] - 1] == 'r')
		{
		for (j = 0;j < l[i] - 2;j++)
		{
		t[i][j] = str[i][j];
		}
		}
		t[i][l[i] - 1] = '\0';

		if (str[i][l[i] - 1] == 'g')
		{
		for (j = 0;j < l[i] - 3;j++)
		{
		t[i][j] = str[i][j];
		}
		}
		t[i][l[i] - 2] = '\0';
		if (str[i][l[i] - 1] == 'y')
		{
		for (j = 0;j < l[i] - 2;j++)
		{
		t[i][j] = str[i][j];
		}
		}
		t[i][l[i] - 1] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",t[i]);
		}
			return 0;
	}

}

