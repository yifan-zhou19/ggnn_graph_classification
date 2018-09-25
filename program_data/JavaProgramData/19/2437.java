package <missing>;

public class GlobalMembers
{
	public static String w = new String(new char[100]);
	public static char[][] m = new char[200][200];
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static int Main()
	{
		w = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int p = 0;
		int q = 0;
		int r;
		for (r = 0;w.charAt(r) != '\0';r++)
		{
			if (w.charAt(r) == ' ')
			{
				p++;
				q = 0;
			}
			else
			{
				m[p][q] = w.charAt(r);
				q++;
			}
		}
		int i;
		int x;
		for (i = 0;i < p + 1;i++)
		{
			if (strcmp(m[i],a) == 0)
			{
				for (x = 0;x < (b.length() + 1);x++)
				{
					m[i][x] = b.charAt(x);
				}
			}
		}
		System.out.printf("%s",m[0]);
		for (i = 1;i < p + 1;i++)
		{
			System.out.printf(" %s",m[i]);
		}

		return 0;
	}

}

