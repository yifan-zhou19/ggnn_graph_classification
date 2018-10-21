package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //???a???q
		int n;
		int i = 1;
		int j = 2;
		int o = 1;
		int p = 1;
		int q = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				while (j < a)
				{
				q = o + p;
				o = p;
				p = q;
				j = j + 1; //????q
				}
			System.out.print(q);
			System.out.print("\n");
			i = i + 1;
			j = 2;
			o = 1;
			p = 1;
			q = 1; //??
		}
		return 0;
	}

}

