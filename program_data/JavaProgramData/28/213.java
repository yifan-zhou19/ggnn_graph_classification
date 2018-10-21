package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int flag = 1;
		int i = 0;
		int j = 0;
		int num;
		int[] count = new int[300];
		char[][] str = new char[300][50];
		char ch;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				ch = tempVar.charAt(0);
			}
			if (ch == '\n')
			{
				str[i][j] = '\0';
				break;
			}
			if (ch == ' ')
			{
				if (flag == 1)
				{
					str[i][j] = '\0';
				}
				flag = 0;
			}
			else
			{
				if (flag == 0)
				{
					j = 0;
					i++;
					str[i][j] = ch;
					j++;
				}
				else
				{
					str[i][j] = ch;
					j++;
				}
				flag = 1;
			}
		}
		num = i + 1;
		for (i = 0;i < num;i++)
		{
			j = 0;
			while (str[i][j] != '\0')
			{
				j++;
			}
			count[i] = j;
		}

		for (i = 0;i < num;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",count[0]);
			}
			else
			{
				System.out.printf(",%d",count[i]);
			}
		}
		//?????????1??????300???????????1?????
	}


}

