package <missing>;

public class GlobalMembers
{
	public static int zimuxiahuaxian(char x)
	{
		int a;
		if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122) || x == '_')
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return a;
	}

	public static int shuzi(char x)
	{
		int a;
		if ((x >= 48) && (x <= 57))
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int k = 0;
		String a = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			m = a.length();
			if (zimuxiahuaxian(a.charAt(0)) == 0)
			{
				k = 0;
			}
			else
			{
				k = 1;
				for (j = 1;j < m;j++)
				{
					if (zimuxiahuaxian(a.charAt(j)) != 1 && shuzi(a.charAt(j)) != 1)
					{
						k = 0;
						break;
					}
					else
					{
						k = 1;
					}
				}
			}
			if (k == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}


}

