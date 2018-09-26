package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];


	public static int Main()
	{
		int n;
		char ch;
		//??
		int al = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a[al++] = n;
			cin.get(ch);
			if (ch == '\n')
			{
				break;
			}
		}
		//??
		int bl = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			b[bl++] = n;
			cin.get(ch);
			if (ch == '\n')
			{
				break;
			}
		}
		//??
		int len = bl;
		//
		int max = 0;
		for (int i = 0; i < 999; i++)
		{
			int cnt = 0;
			for (int j = 0; j < len; j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					cnt++;
				}
			}
			if (cnt > max)
			{
				max = cnt;
			}
		}
		System.out.print(len);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}
}

