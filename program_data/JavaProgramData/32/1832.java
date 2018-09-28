package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int k;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.in.read();
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			p = String.valueOf(a[i]).length();
			q = String.valueOf(b[i]).length();
			for (j = 0;j < q;j++)
			{
				if (a[i][p - j - 1] >= b[i][q - j - 1])
				{
					a[i][p - j - 1] = a[i][p - j - 1] - b[i][q - j - 1] + 48;
				}
				else
				{
					a[i][p - j - 1] = a[i][p - j - 1] - b[i][q - j - 1] + 58;
					if (a[i][p - j - 2] != 48)
					{
						a[i][p - j - 2] = a[i][p - j - 2] - 1;
					}
					else
					{
						a[i][p - j - 2] = 57;
						for (k = 3;;k++)
						{
							if (a[i][p - j - k] != 48)
							{
								a[i][p - j - k]--;
								break;
							}
							else
							{
								a[i][p - j - k] = 57;
							}
						}
					}
				}
			}
			System.out.println(a[i]);
		}
	}
}

