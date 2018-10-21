package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[255]);
	public static char b;

	public static void solve(int l, int r)
	{
	int c = 0;
	int i = l + 1;
	int j = l + 1;
	while (i < r - 1)
	{
	  do
	  {
		if (s.charAt(i++) == b)
		{
			c++;
		}
		else
		{
			c--;
		}
	  } while (c > 0);
	  solve(j, i - 1);
	  j = i;
	}
	System.out.printf("%d %d\n", l, r);
	}

	public static int Main()
	{
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	b = s.charAt(0);
	l = s.length() - 1;
	if (l % 2 == 0)
	{
		l--;
	}
	solve(0, l);
	return 0;
	}

}

