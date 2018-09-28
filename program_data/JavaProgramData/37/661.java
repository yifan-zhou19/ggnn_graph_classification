package <missing>;

public class GlobalMembers
{
	//**************************************
	//????????????????     *
	//??????                         *
	//???2011.11.3                      *
	//**************************************
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int num = 0;
		int flag = 0;
		char[][] a = new char[10][100000];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0; i < t; i++)
		{
			flag = 0;
			for (j = 0; a[i][j] != '\0' ; j++)
			{

				for (k = j + 1; a[i][k] != '\0' ; k++)
				{

					if (a[i][k] == a[i][j])
					{
						num = 1;
						a[i][k] = ' ';
					}

				}
				if ((num == 0) && (a[i][j] != ' '))
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					flag = 1;
					break;
				}
				num = 0;
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

