package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][81];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if (**(str + i) >= 65 && **(str + i) <= 90 || **(str + i) >= 97 && **(str + i) <= 122 || **(str + i) == 95)
			{
				for (j = 1;str[i][j] != '\0';j++)
				{
					if (*(*(str + i) + j) >= 65 && *(*(str + i) + j) <= 90 || *(*(str + i) + j) >= 97 && *(*(str + i) + j) <= 122 || *(*(str + i) + j) >= 48 && *(*(str + i) + j) <= 57 || *(*(str + i) + j) == 95)
					{
						;
					}
					else
					{
						break;
					}
				}
				if (str[i][j] != '\0')
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			else
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
	}

}

