package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int u;
		int n;
		int len;
		int flag;
		char[][] str = new char[1000][81];
		String num = new String(new char[10]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			flag = 1;
			str[i] = new Scanner(System.in).nextLine();
			len = String.valueOf(str[i]).length();
			if ((str[i][0] == '_') || (str[i][0] >= 'a' && str[i][0] <= 'z') || (str[i][0] >= 'A' && str[i][0] <= 'Z'))
			{
				for (u = 0;u < len;u++)
				{
					if (str[i][u] == '_' || (str[i][u] >= 'a' && str[i][u] <= 'z') || (str[i][u] >= 'A' && str[i][u] <= 'Z') || (str[i][u] >= '0' && str[i][u] <= '9'))
					{
						continue;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			System.out.printf("%d\n",flag);
		}
		return 0;
	}

}
