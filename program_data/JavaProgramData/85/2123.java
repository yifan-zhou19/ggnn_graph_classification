package <missing>;

public class GlobalMembers
{
	public static int s(char n)
	{
		if (('a' <= n && n <= 'z') || ('A' <= n && n <= 'Z') || n == '_')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int f(char n)
	{
		if (('a' <= n && n <= 'z') || ('A' <= n && n <= 'Z') || n == '_' || ('0' <= n && n <= '9'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int fl;
		String w = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int fl = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			if (s(w.charAt(0)) == 0)
			{
				fl = 0;
			}
			for (j = 1;j < w.length();j++)
			{
				if (f(w.charAt(j)) == 0)
				{
					fl = 0;
				}
			}
			fl != 0?System.out.print("yes\n"):printf("no\n");
		}
			return 0;
	}
}

