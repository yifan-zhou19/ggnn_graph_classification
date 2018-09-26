package <missing>;

public class GlobalMembers
{
	public static void checkit(String a)
	{
		int i;
		int n;
		n = a.length();
		for (i = 0;i < n;i++)
		{
			a[i] = a[i + 1];
		}
		if (a[0].equals('0'))
		{
			checkit(a);
		}
	}

	public static void doit(String a, String b)
	{
		int x;
		int y;
		int i;
		int m;
		x = a.length();
		y = b.length();
		for (i = 0;i < y;i++)
		{
			m = a[x - 1 - i] - b[y - 1 - i].Substring(48);
			if (m < 48)
			{
				a[x - 2 - i] = a[x - 2 - i] - 1;
				m = m + 10;
			}
			a[x - 1 - i] = m;
		}
		if (a[0].equals('0'))
		{
			checkit(a);
		}
	}

	public static void Main()
	{
		char[][] a = new char[20][101];
		char[][] b = new char[20][101];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = tempVar3.charAt(0);
		}
		for (i = 1;i < n;i++)
		{
			System.in.read();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = tempVar5.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			doit(a[i], b[i]);
			System.out.printf("%s\n",a[i]);
		}
	}
}

