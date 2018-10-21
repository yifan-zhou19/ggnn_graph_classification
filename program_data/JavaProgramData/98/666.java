package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[500][50];
		int i;
		int j;
		int n;
		int m;
		int[] l = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			ch[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = String.valueOf(ch[i]).length();
		}
		m = 0;
		for (i = 1;i <= n;i++)
		{
			if (m > 0)
			{
				if (m + 1 + l[i] <= 80)
				{
					System.out.print(' ');
					System.out.print(ch[i]);
					m += l[i] + 1;
				}
				else
				{
					m = 0;
					System.out.print("\n");
				}
			}
			if (m == 0)
			{
				System.out.print(ch[i]);
				m += l[i];
			}
		}
		return 0;
	}
}

