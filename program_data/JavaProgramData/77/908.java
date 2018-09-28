package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]); //??????
	public static char girl;
	public static char boy;
	public static int work(int l, int r) //??work??
	{
		if (a.charAt(l) != a.charAt(l + 1))
		{
			System.out.print(l);
			System.out.print(' ');
			System.out.print(l + 1);
			System.out.print("\n");
			return 0;
		}
		int p;
		int s;
		int q;
		q = l + 1;
		p = l + 2;
		s = 1;
		while (p < r) //????????????????????
		{
			while (s != 0)
			{
				if (a.charAt(p) == boy)
				{
					s++;
				}
				if (a.charAt(p) == girl)
				{
					s--;
				}
				p++;
			}
			work(q, p - 1); //?????????
			s = 1; //??cnt,??tmp???????????
			q = p;
			p++;
		}
		System.out.print(l);
		System.out.print(' ');
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int i = 0;
		int p;
		int len = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		boy = a.charAt(0);
		girl = a.charAt(len - 1);
		work(0, len - 1);
		return 0;
	}

}

