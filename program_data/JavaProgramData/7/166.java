package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		int i;
		int j;
		int t;
		int l;
		int k = 0;
		int m = 0;
		l = (int)a.length();
		t = (int)b.length();
		for (i = 0;i < l - t + 1;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					k = 0;
				}
				if (a.charAt(i + j) == b.charAt(j))
				{
					k = k + 1;
				}
				if (t == k)
				{
					m = i;
					i = l;
				}
			}
		}
		if (m == 0)
		{
			System.out.printf("%s",a);
		}
		if (m != 0)
		{
			for (i = 0;i < m;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",c);
			for (i = m + t;i < l;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}

}

