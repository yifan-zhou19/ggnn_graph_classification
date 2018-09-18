package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		String s = new String(new char[100]);
		String d = new String(new char[100]);
		char[][] e = new char[30][30];
		int m = 0;
		int n = 0;
		int l;
		int i;
		c = new Scanner(System.in).nextLine();
		l = c.length();
		s = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		for (i = 0;i < (l + 1);i++)
		{
			e[m][n] = c.charAt(i);
			n++;
			if (c.charAt(i) == ' ')
			{
				e[m][n - 1] = 0;
				m++;
				n = 0;
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (strcmp(s,e[i]) == 0)
			{
				e[i] = d;
			}
		}
		System.out.printf("%s",e[0]);
		for (i = 1;i <= m;i++)
		{
			System.out.printf(" %s",e[i]);
		}


	}
}
