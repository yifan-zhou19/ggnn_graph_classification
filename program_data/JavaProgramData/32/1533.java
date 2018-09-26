package <missing>;

public class GlobalMembers
{
	public static void j(String a, String b)
	{
		int i;
		int m;
		int n;
		m = a.length();
		n = b.length();
		for (i = m - 1;i >= m - n;i--)
		{
			a[i] = a[i] - b[i - m + n].Substring(48);
		}
		for (i = m - 1;i >= 0;i--)
		{
			if (a[i].compareTo(48) < 0)
			{
				a[i] = a[i].Substring(10);
				a[i - 1] = a[i - 1] - 1;
			}
		}
		System.out.printf("%s\n",a);
	}

	public static void Main()
	{
		int i;
		int n;
		char[][] a = new char[20][100];
		char[][] b = new char[20][100];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			c = System.in.read();
		}
		for (i = 0;i < n;i++)
		{
			j(a[i], b[i]);
		}
	}
}

