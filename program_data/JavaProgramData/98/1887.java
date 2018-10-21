package <missing>;

public class GlobalMembers
{
	public static final int maxlen = 80;

	public static String st = new String(new char[50]);

	public static int n;
	public static int len;
	public static int newline;
	public static int nowlen;

	public static int Main()
	{

		//freopen("a.in", "r", stdin);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		newline = 1;
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st = tempVar2.charAt(0);
			}
			nowlen = st.length();
			if ((i != 0?1:0) + nowlen + len > maxlen)
			{
				System.out.printf("\n%s", st);
				len = nowlen;
			}
			else
			{
				if (i != 0)
				{
					System.out.print(' ');
				}
				System.out.printf("%s", st);
				len += (i != 0?1:0) + nowlen;
			}
		}

		return 0;
	}

}

