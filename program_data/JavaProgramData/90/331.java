package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int total;
	public static void putapp(int app, int dish, int last)
	{ //app:???? dish:???? last????????                    //???????
		//cout << total << endl;
		if ((dish > 0 && app < last) || (dish == 0 && app>0))
		{
			return;
		}
		if (dish == 0 && app == 0)
		{
			total++;
		}
		for (int i = last; i <= app; i++)
		{
			putapp(app - i, dish - 1, i);
		}
		if (dish == n)
		{
			System.out.print(total);
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		while (i < a)
		{
			total = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			putapp(m, n, 0);
			i++;
		}
		return 0;
	}

}

