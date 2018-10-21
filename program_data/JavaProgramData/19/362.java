package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String cc = "";
		final String c1 = "";
		final String c2 = "";
		final String c = "";
		String p1;
		String p2;
		String p3;
		String p4;
		int a;
		int b;
		int d;
		int e = 0;
		int f = 0;
		int h;
		int i;
		cc = new Scanner(System.in).nextLine();
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		p1 = c.charAt(0)[0];
		p2 = c1.charAt(0);
		p3 = c2.charAt(0);
		p4 = cc.charAt(0);
		for (a = 0;a < 500;a++)
		{
			if (*(p4.Substring(a)) == ' ')
			{
				e++;
				f = 0;
			}
			else if (*(p4.Substring(a)) != '\0')
			{
				*(p1.Substring(e) * 20 + f) = *(p4.Substring(a));
				f++;
			}
			else
			{
				break;
			}
		}
		i = c1.length();
		h = c2.length();
		for (a = 0;a < e+1;a++)
		{
			for (b = 0;b < i;b++)
			{
				if (*(p1.Substring(a) * 20 + b) != *(p2.Substring(b)))
				{
					break;
				}
			}
			if (b == i)
			{
				for (d = 0;d < h;d++)
				{
					*(p1.Substring(a) * 20 + d) = *(p3.Substring(d));
				}
				for (d = h;d < 20;d++)
				{
					   *(p1.Substring(a) * 20 + d) = '\0';
				}
			}
		}
		for (d = 0;d < e;d++)
		{
			System.out.printf("%s ",c.charAt(d));
		}
		System.out.printf("%s\n",c.charAt(e));
	}

}
