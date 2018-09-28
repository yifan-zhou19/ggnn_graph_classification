package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int m;
		int n;
		int i;
		int j;
		int r = 0;
		int t = 0;
		int s = 0;
		int q = 0;
		int p = 0;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			r = r + a.charAt(i);
		}
		for (i = 0;i < n;i++)
		{
			o = o + b.charAt(i);
		}


		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (a.charAt(j) == a.charAt(i))
				{
					a = a.substring(0, j);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			t = t + a.charAt(i);
			if (a.charAt(i) != 0)
			{
				s++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b.charAt(j) == b.charAt(i))
				{
					b = b.substring(0, j);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			q = q + b.charAt(i);
			if (b.charAt(i) != 0)
			{
				p++;
			}
		}
		if (t == q && s == p && r == o)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

