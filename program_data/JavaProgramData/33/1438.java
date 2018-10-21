package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String num = new String(new char[100]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		char[][] jjl = new char[n][260];
		for (i = 0;i < n;i++)
		{
			jjl[i] = new Scanner(System.in).nextLine();
			for (j = 0;jjl[i][j] != '\0';j++)
			{
				if (jjl[i][j] == 'A')
				{
					jjl[i][j] = 'T';
				}
				else if (jjl[i][j] == 'T')
				{
					jjl[i][j] = 'A';
				}
				else if (jjl[i][j] == 'G')
				{
					jjl[i][j] = 'C';
				}
				else if (jjl[i][j] == 'C')
				{
					jjl[i][j] = 'G';
				}
			}
			System.out.println(jjl[i]);
		}
		return 0;
	}

}
