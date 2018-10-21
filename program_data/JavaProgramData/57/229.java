package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[51];
		char[][] s = new char[51][51];
		String str = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n + 1;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			a[i] = String.valueOf(s[i]).length();
		}
		for (i = 1;i < n + 1;i++)
		{
			if (s[i][a[i] - 1] == 'r')
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][a[i] - 1] == 'y')
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][a[i] - 1] == 'g')
			{
				for (j = 0;j < a[i] - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			System.out.print("\n");
		}

	}
}

