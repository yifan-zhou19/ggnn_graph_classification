package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int p;
		int l;
		char[][] s = new char[100][100];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			l = String.valueOf(s[i]).length();
			for (j = 0;j < l;j++)
			{
				a[j] = 0;
			}
			for (j = 0;j < l;j++)
			{
				if (s[i][j] == '(')
				{
					a[j] = 1;
				}
				if (s[i][j] == ')')
				{
					a[j] = 2;
				}
			}
			for (j = 0;j < l;j++)
			{
				if (a[j] == 2)
				{
					for (m = j;m >= 0;m--)
					{
						if (a[m] == 1)
						{
							a[m] = 0;
							a[j] = 0;
							break;
						}
					}
				}
			}
			System.out.println(s[i]);
			for (j = 0;j < l;j++)
			{
				if (a[j] == 1)
				{
					System.out.print("$");
				}
				if (a[j] == 2)
				{
					System.out.print("?");
				}
				if (a[j] == 0)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}

