package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int wl = 0;
		int ll = 0;
		int i;
		final String c = "";
		char ch;
		String p = c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
			do
			{
					cin.get(ch);
			if (ch != ' ')
			{
				System.out.print(ch);
				ll++;
			}
			} while (ch != ' ');
		for (i = 1; i <= n; i++)
		{
			wl = 0;
			p = c;
			cin.get(ch);
			while (ch != ' ' && ch != '\n')
			{
				wl++;
				p = ch;
				p = p.Substring(1);
				cin.get(ch);
			}
			if (ll + wl < 80 && i < n)
			{
				System.out.print(' ');
				ll = ll + wl + 1;
			}
			else
			{
				System.out.print("\n");
				ll = wl;
			}
			for (p = c; p < (c.Substring(wl)); p++)
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}

