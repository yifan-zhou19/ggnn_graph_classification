package <missing>;

public class GlobalMembers
{
	public static int change(char m)
	{
			int result;
			if ((m - '0' >= 0) && (m - '0' < 10))
			{
				result = m - '0';
			}
			else if ((m - 'a' >= 0) && (m - 'a' < 26))
			{
				result = m - 'a' + 10;
			}
			else if ((m - 'A' >= 0) && (m - 'A' < 26))
			{
				result = m - 'A' + 10;
			}
			return result;
	}
	public static char trans(int n)
	{
		char last;
		if (n >= 0 || n < 10)
		{
			last = '0' + n;
		}
		if (n > 9)
		{
			last = 'A' + n - 10;
		}
		return last;
	}
	public static int Main()
	{
		String f = new String(new char[10000]);
		int[] g = new int[10000];
		int a;
		int b;
		int i;
		int len;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			f = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = f.length();
		for (i = 0;i < len;i++)
		{
			s = change(f.charAt(i)) + s * a;
		}
		while (s / b != 0)
		{
			g[t] = s % b;
			s /= b;
			t++;
		}
		g[t] = s % b;
		for (i = t;i >= 0;i--)
		{
			System.out.printf("%c",trans(g[i]));
		}
		return 0;
	}

}

