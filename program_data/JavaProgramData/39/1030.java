public class l
{
	public String a = new String(new char[22]);
	public int x;
	public int y;
	public char m;
	public char n;
	public int h;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l[] s = tangible.Arrays.initializeWithDefaultlInstances(101);
		int f = 0;
		int j;
		int c = 0;
		for (i = 1;i <= n;i++)
		{
			int p = 0;
			s[i].a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].m = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s[i].n = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s[i].h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (s[i].x > 80 && s[i].h >= 1)
		{
			p += 8000;
		}
		if (s[i].x > 85 && s[i].y > 80)
		{
			p += 4000;
		}
		if (s[i].x > 90)
		{
			p += 2000;
		}
		if (s[i].x > 85 && s[i].n == 'Y')
		{
			p += 1000;
		}
		if (s[i].y > 80 && s[i].m == 'Y')
		{
			p += 850;
		}
		c += p;
		if (p > f)
		{
			f = p;
			j = i;
		}
		}


		System.out.print(s[j].a);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}

}

