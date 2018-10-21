package <missing>;

public class GlobalMembers
{
	public static int pan(int n)
	{
		int i;
		int l = 0;
		int t = Math.sqrt(n);
		for (i = 2;i <= t;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i > t)
		{
			l = 1;
		}
		if (n == 1)
		{
			l = 0;
		}
		return l;
	}
	public static int wei(int n)
	{
		int i = 1;
		while (true)
		{
			n = n / 10;
			if (n == 0)
			{
				break;
			}
			i = i + 1;
		}
		return i;
	}
	public static int huiwen(int n)
	{
		final String a = "";
		int w = wei(n);
		int i;
		int l;
		int s = 1;
		for (i = 0;i < w;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, n % 10);
			n = n / 10;
		}
		for (l = 0;l < w / 2;l++)
		{
			s = s * (a.charAt(l) == a.charAt(w - 1 - l));
		}
		return s;
	}
	public static int Main()
	{
		int p = 0;
		int i;
		int m;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("  ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) != 0 && pan(i) != 0)
			{
				System.out.printf("%d",i);
				p += 1;
				break;
			}
		}
		for (l = i + 1;l <= n;l++)
		{
			if (huiwen(l) != 0 && pan(l) != 0)
			{
				System.out.printf(",%d",l);
				p += 1;
			}
		}
		if (p == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}


}

