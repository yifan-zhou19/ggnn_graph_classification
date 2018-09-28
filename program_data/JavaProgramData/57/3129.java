package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[7][40];
		int n;
		int i;
		int l;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0;t < n;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[0] = tempVar2.charAt(0);
			}
			l = String.valueOf(str[0]).length();

			if (l <= 2)
			{
				continue;
			}
			else if (l == 3)
			{
				if (str[0][1] == 'e' && str[0][2] == 'r' || str[0][1] == 'l' && str[0][2] == 'y')
				{
					System.out.printf("%c\n",str[0][0]);
				}
			}

				else
				{
				for (i = 1;i < 7;i++)
				{
					for (j = 0;j < 40;j++)
					{
						str[i][j] = 0;
					}
				}
				str[1] = String.valueOf(str[0]).substring(0, l - 3);
				str[2] = str[1];
				str[1] += "ing";
				if (strcmp(str[0],str[1]) == 0)
				{
				System.out.printf("%s\n",str[2]);
				continue;
				}

				str[3] = String.valueOf(str[0]).substring(0, l - 2);
				str[4] = str[3];
				str[3] += "er";
				if (strcmp(str[0],str[3]) == 0)
				{
					System.out.printf("%s\n",str[4]);
					continue;
				}

				str[5] = String.valueOf(str[0]).substring(0, l - 2);
				str[6] = str[5];
				str[5] += "ly";
				if (strcmp(str[0],str[5]) == 0)
				{
				System.out.printf("%s\n",str[6]);
				continue;
				}
				}

		}
		return 0;
	}

}

