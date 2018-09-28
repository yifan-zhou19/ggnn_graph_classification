package <missing>;

public class GlobalMembers
{
	//????  ???
	public static int l;
	public static int js = 0;
	public static char a;
	public static char b;

	public static void search(String c)
	{
		int i;
		int j;
		for (i = 0; i <= l - 1; i++)
		{
			if (c[i].equals(b))
			{
				break; //???????????
			}
		}
		for (j = i - 1; j >= 0; j--)
		{
			if (c[j].equals(a)) //?????????
			{
				c[i] = 'Z';
				c[j] = 'Z'; //???????????????
				System.out.print(j);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				js += 2;
				if (js == l) //?????????
				{
					return;
				}
				else
				{
					search(c); //????
				}
			}
		}
	}


	public static int Main()
	{
		int i;
		String s = new String(new char[201]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s.length(); //????
		a = s.charAt(0); //a?????????b????????
		for (i = 1; i <= l - 1; i++)
		{
			if (s.charAt(i) != a)
			{
				b = s.charAt(i);
				break;
			}
		}
		search(s); //??????????
		return 0;

	}
}

