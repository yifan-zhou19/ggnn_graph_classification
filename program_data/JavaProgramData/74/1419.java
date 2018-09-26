package <missing>;

public class GlobalMembers
{
	public static int judge1(int n)
	{
		int i;
		int u = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				u = 0;
				break;
			}
		}
		return u;
	}
	public static int judge2(int n)
	{
		String s = new String(new char[10]);
		int i;
		int t;
		int r;
		int u = 1;
		for (t = n,r = 1;;r++)
		{
			t = t / 10;
			if (t == 0)
			{
				break;
			}
		}
		for (t = n,i = r - 1;i >= 0;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, t % 10 + '0');
			t = t / 10;
		}
		for (i = 0;i < r - i - 1;i++)
		{
			if (s.charAt(i) != s.charAt(r - i - 1))
			{
				u = 0;
			}
		}
		return u;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (judge1(i) != 0 && judge2(i) != 0)
			{
				System.out.printf("%d",i);
				u = 1;
				break;
			}
		}
		i = i + 1;
		for (;i <= n;i++)
		{
			if (judge1(i) != 0 && judge2(i) != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (u == 0)
		{
			System.out.print("no");
		}
	}
}

