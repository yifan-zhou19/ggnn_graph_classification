package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		char[][] a = new char[100][120];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			System.out.println(a[i]);
			k = String.valueOf(a[i]).length();
			for (j = 0;j < k;j++)
			{

				if (a[i][j] == ')')
				{
					a[i][j] = '?';
				}
				if (a[i][j] == '(')
				{
					a[i][j] = '$';
				}
			}
			for (j = 0;j < k;j++)
			{
				if (a[i][j] != '?' && a[i][j] != '$')
				{
					a[i][j] = ' ';
				}
			}
			for (j = 0;j < k;j++)
			{
				if (a[i][j] == '?')
				{
					for (l = j;l >= 0;l--)
					{
						if (a[i][l] == '$')
						{
							a[i][j] = ' ';
							a[i][l] = ' ';
							break;
						}
					}
				}
			}
			for (j = 0;j < k;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

