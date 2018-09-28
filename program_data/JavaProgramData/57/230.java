package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String[] str = {""};
		String[] str_o = {""};
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
			t = String.valueOf(str[i]).length();
			if (str[i][t - 3] == 'i' && str[i][t - 2] == 'n')
			{
				for (j = 0;j < t - 3;j++)
				{
					str_o[i][j] = str[i][j];
				}
			}
			else
			{
				for (j = 0;j < t - 2;j++)
				{
					str_o[i][j] = str[i][j];
				}
			}
			System.out.printf("%s\n",str_o[i]);

		}

	}
}

