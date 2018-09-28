package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		final String t = "";
		int i;
		int j;
		int m;
		int n;
		int p;
		String wp;
		String tp;
		wp = w;
		tp = t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = s.length();
		n = w.length();
		for (i = 0;i < n;i++)
		{
			for (j = i;j < (i + m);j++)
			{
			*(tp.Substring(j) - i) = *(wp.Substring(j));
			}
			if (strcmp(t,s) == 0)
			{
				p = i;
				break;
			}
		}
		System.out.printf("%d",p);
	}
}

