package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max_size = 1000;
		int[] l = new int[max_size];
		int[] r = new int[max_size];
		for (int i = 0; i < max_size; ++i)
		{
			l[i] = 0;
			r[i] = 0;
		}
		int x;
		int att;
		char ch;

		att = 1;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read();
		++l[x];
		while (ch == ',')
		{
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   ch = System.in.read();
		   ++l[x];
		   ++att;
		}
		System.out.print(att);
		System.out.print(" ");
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read();
		++r[x];
		while (ch == ',')
		{
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   ch = System.in.read();
		   ++r[x];
		}

		int ans;
		int num;
		ans = 0;
		num = 0;
		for (int i = 0; i < max_size; ++i)
		{
			num = num + l[i] - r[i];
			if (num > ans)
			{
					ans = num;
			}
		}
		System.out.print(ans);
		return 0;
	}
}

