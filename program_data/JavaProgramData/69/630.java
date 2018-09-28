package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[300];
	public static int[] d = new int[300];
	public static void plus(int i,int j,int a)
	{
		if (i >= 0)
		{
			a += c[i];
		}
		if (j >= 0)
		{
			a += d[j];
		}
		if (i >= 0 || j >= 0)
		{
			plus(i - 1, j - 1, (a) / 10);
			System.out.printf("%d",(a) % 10);
		}
		else if (a)
		{
			System.out.printf("%d",a);
		}
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) == '0' && i < a.length();i++)
		{
			;
		}
		for (j = i;i < a.length();i++)
		{
			c[i - j] = a.charAt(i) - '0';
		}
		n = i - j;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;a.charAt(i) == '0' && i < a.length();i++)
		{
			;
		}
		for (j = i;i < a.length();i++)
		{
			d[i - j] = a.charAt(i) - '0';
		}
		m = i - j;
		plus(n - 1, m - 1, 0);
		if (n - 1 < 0 && m - 1 < 0)
		{
			System.out.print("0\n");
		}
		return 0;
	}

}

