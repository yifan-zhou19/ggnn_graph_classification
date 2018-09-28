package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len = 0;
		int l = 0;
		int i;
		int j;
		char[][] a = new char[1000][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= n - 1 ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		l = String.valueOf(a[0]).length();
		System.out.print(a[0]);
		for (i = 1 ; i <= n - 1 ; i++)
		{
			len = String.valueOf(a[i]).length();
			if (l + len + 1 <= 80)
			{
				l = l + len + 1;
				System.out.print(' ');
				System.out.print(a[i]);
			}
			else if (l + len + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(a[i]);
				l = len;
			}
		}
		return 0;
	}


}

