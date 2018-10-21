package <missing>;

public class GlobalMembers
{
	public static int than(String a, String b)
	{
		int x = 1;
		int len;
		int i;
		int m;
		int n;
		int j;
		len = a.length();
		for (i = 0;i <= len - 1;i++)
		{
			m = 0;
			n = 0;
			for (j = 0;j <= len - 1;j++)
			{
				if (a[j].equals(a[i]))
				{
					m = m + 1;
				}
				if (a[i].equals(b[j]))
				{
					n = n + 1;
				}
			}
			if (m != n)
			{
				x = 0;
			}
		}
		return x;
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int x;
		int y;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x = a.length();
		y = b.length();
		if (x != y)
		{
			System.out.print("NO\n");
		}
		else
		{
			k = than(a, b);
			if (k != 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

