package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[50];
		char[][] str = new char[50][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			str[i] = new Scanner(System.in).nextLine(); //??????
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = String.valueOf(str[i]).length();
			if ((str[i][a[i] - 1] == 'r' && str[i][a[i] - 2] == 'e') || (str[i][a[i] - 1] == 'y' && str[i][a[i] - 2] == 'l'))
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
				System.out.print("\n");
			}
			else if (str[i][a[i] - 1] == 'g' && str[i][a[i] - 2] == 'n' && str[i][a[i] - 3] == 'i')
			{
				for (j = 0;j < a[i] - 3;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
				System.out.print("\n");
			}
			else
			{
				System.out.println(str[i]);
			}
		}



	}
}

