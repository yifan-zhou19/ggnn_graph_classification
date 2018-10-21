package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int n;
		int i;
		int j;
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		n = w.length();
		m = s.length();
		j = 0;
		i = 0;
		while (j != m)
		{
			j = 0;
			while (w.charAt(i) != s.charAt(j) && i < n)
			{
				i++;
			}
			while (w.charAt(i) == s.charAt(j) && j < m && i < n)
			{
				i++;
				j++;
			}
		}
		System.out.printf("%d",i - m);
		return 0;
	}
}

