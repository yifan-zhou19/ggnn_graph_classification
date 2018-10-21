package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int g;
		int e;
		int f = 1;
		int i;
		int[] c = new int[250];
		int[] d = new int[250];
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
		e = a.length();
		g = b.length();
		if (e != g)
		{
			f = 0;
		}
		for (i = 0;i < e;i++)
		{
			c[a.charAt(i)]++;
		}
		for (i = 0;i < g;i++)
		{
			d[b.charAt(i)]++;
		}
		for (i = 0;i < 250;i++)
		{
			if (c[i] != d[i])
			{
				f = 0;
			}
		}
		if (f == 0)
		{
			System.out.print("NO");
		}
		if (f == 1)
		{
			System.out.print("YES");
		}
		return 0;
	}
}

