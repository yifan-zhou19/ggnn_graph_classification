package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[200][200];
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			System.in.read();
			for (j = 1;j <= n;j++)
			{

				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					s[i][j] = tempVar2.charAt(0);
				}

			}

		}

		int m;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int k;
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					   if (s[i][j] == '@')
					   {
						 if (i - 1 >= 1 && s[i - 1][j] != '#' && s[i - 1][j] != '@')
						 {
								s[i - 1][j] = '0';

						 }
						 if (i + 1 <= n != 0 && s[i + 1][j] != '#' && s[i + 1][j] != '@')
						 {
							  s[i + 1][j] = '0';
						 }
						 if (j - 1 >= 1 && s[i][j - 1] != '#' && s[i][j - 1] != '@')
						 {
							 s[i][j - 1] = '0';
						 }
						 if (j + 1 <= n != 0 && s[i][j + 1] != '#' && s[i][j + 1] != '@')
						 {
							s[i][j + 1] = '0';
						 }
					   }


				}
			}

			for (i = 1;i <= n;i++)
			{
			   for (j = 1;j <= n;j++)
			   {
				   if (s[i][j] == '0')
				   {
					   s[i][j] = '@';
				   }
			   }


			}
		}
		int num = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] == '@')
				{
					num++;

				}
			}
		}
		System.out.printf("%d",num);

		return 0;


	}
}

