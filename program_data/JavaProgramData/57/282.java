package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[10000][100];
		int l;
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (k = 0;k < n + 1;k++)
		{
			l = String.valueOf(str[k]).length();
			if (str[k][l - 1] == 'g')
			{
				str[k][l - 3] = '\0';
			}
			else if (str[k][l - 1] == 'r')
			{
				str[k][l - 2] = '\0';
			}
			else if (str[k][l - 1] == 'y')
			{
				str[k][l - 2] = '\0';
			}
		}
		for (j = 0;j < n + 1;j++)
		{
			System.out.printf("%s\n",str[j]);
		}
	}
}

