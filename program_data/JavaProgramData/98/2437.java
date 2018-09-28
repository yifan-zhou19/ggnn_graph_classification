package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][50];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		int e = 1;
		int len = 0;
		for (i = 1;i <= n;i++)
		{
			if (e != 0)
			{
				System.out.print((a + i));
				e = 0;
				len = String.valueOf(*(a + i)).length() + 1;
			}
			else
			{
				if ((len + String.valueOf(*(a + i)).length()) > 80)
				{
					System.out.print("\n");
					len = 0;
					i--;
					e = 1;
				}
				else
				{
					System.out.print(' ');
					System.out.print((a + i));
					len += String.valueOf(*(a + i)).length() + 1;
				}
			}
		}
		return 0;
	}

}

