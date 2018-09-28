package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int len;
		int k;
		char[][] str = new char[6][7];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
		}
		for (i = 0;i < 6;i++)
		{
			if (Integer.parseInt(str[i]) > 0)
			{
				len = String.valueOf(str[i]).length();
				for (j = len - 1;j >= 0;j--)
				{
					if (str[i][j] != '0')
					{
						break;
					}
				}
				for (k = j;k >= 0;k--)
				{
					System.out.printf("%c",str[i][k]);
				}
				System.out.print("\n");
			}
			else if (Integer.parseInt(str[i]) < 0)
			{
				System.out.print("-");
				len = String.valueOf(str[i]).length();
				for (j = len - 1;j >= 0;j--)
				{
					if (str[i][j] != '0')
					{
						break;
					}
				}
				for (k = j;k >= 1;k--)
				{
					System.out.printf("%c",str[i][k]);
				}
				System.out.print("\n");
			}
			else if (Integer.parseInt(str[i]) == 0)
			{
				System.out.print("0\n");
			}
		}
	}

}

