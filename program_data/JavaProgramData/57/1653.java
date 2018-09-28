package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[50][100];
		int[] length = new int[50];
		int i;
		int j;
		int n;
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
		}
		for (i = 0;i < n;i++)
		{
			length[i] = String.valueOf(str[i]).length();
			if (str[i][length[i] - 1] == 'r' || str[i][length[i] - 1] == 'y')
			{
				for (j = length[i] - 2;j < 100;j++)
				{
					str[i][j] = '\0';
				}
				System.out.printf("%s\n",str[i]);
			}
			else if (str[i][length[i] - 1] == 'g')
			{
				for (j = length[i] - 3;j < 100;j++)
				{
					str[i][j] = '\0';

				}
				System.out.printf("%s\n",str[i]);
			}
		}
		return 0;
	}

}

