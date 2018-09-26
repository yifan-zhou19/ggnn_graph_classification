package <missing>;

public class GlobalMembers
{
	public static int isA(char a)
	{
		if ((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_')
		{
			return 1;
		}
		return 0;
	}
	public static int isStart(char a)
	{
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_')
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
			int i = 0;
			int n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			char[][] array = new char[300][81];
			for (i = 0 ; i < n ; i++)
			{
				array[i] = new Scanner(System.in).nextLine();
			}
			for (i = 0 ; i < n ; i++)
			{
				int len = String.valueOf(array[i]).length();
				int j = 0;
				int flag = 1;
				if (isStart(array[i][0]) == 1)
				{
					for (;j < len;j++)
					{
						if (isA(array[i][j]) == 0)
						{
							flag = 0;
						}
					}
				}
				else
				{
					flag = 0;
				}
				if (flag == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			return 0;
	}
}

