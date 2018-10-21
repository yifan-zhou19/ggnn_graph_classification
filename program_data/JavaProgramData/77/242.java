package <missing>;

public class GlobalMembers
{
	public static void change(String str, char w, char m)
	{
		int ctr = 0;
		int ctr1 = 0;
		for (ctr = 0; !str[ctr + 1].equals('\0');ctr++)
		{
			if (str[ctr].equals(w))
			{
				continue;
			}
			for (ctr1 = ctr + 1;ctr1 < str.length();ctr1++)
			{
				if (!str[ctr1].equals(' '))
				{
					break;
				}
			}
			if (str[ctr1].equals(w))
			{
				System.out.printf("%d %d\n",ctr,ctr1);
				str[ctr] = str[ctr1] = ' ';
				break;
			}
		}

	}
	public static int Main()
	{
		final String a = "";
		char w;
		char m;
		int i = 0;
		a = new Scanner(System.in).nextLine();
		m = a.charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				break;
			}
		}
			w = a.charAt(i);
		for (i = 0;i < a.length() / 2;i++)
		{
			change(a, w, m);
		}
		return 0;
	}

}
