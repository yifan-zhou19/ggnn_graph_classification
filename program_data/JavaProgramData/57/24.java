package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] string = new char[50][20];
		char[][] str = new char[50][20];
		char c;
		int i;
		int n;
		int d;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			String[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
			d = String.valueOf(String[i]).length();
			if ((c = string[i][d - 1]) == 'r' || (c = string[i][d - 1]) == 'y')
			{
			 for (k = 0;k < d - 2;k++)
			 {
				 str[i][k] = string[i][k];
			 }
			 str[i][d - 2] = '\0';
			}
			else
			{

		if ((c = string[i][d - 1]) == 'g')
		{
	 for (k = 0;k < d - 3;k++)
	 {
				 str[i][k] = string[i][k];
	 }
	 str[i][d - 3] = '\0';
		}
		else
		{
	 for (k = 0;k < d ;k++)
	 {
				 str[i][k] = string[i][k];
	 }
	 str[i][d] = '\0';
		}
			}
		}

		for (i = 0;i <= n;i++)
		{
			System.out.println(str[i]);
		}
	}

}

