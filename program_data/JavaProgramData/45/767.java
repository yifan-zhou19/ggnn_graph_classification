package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		int t = 0;
		int m;
		int l;
		int k;
		int i = s.length() - 1;
		int j = w.length() - 1;
		for (k = 0;;k++)
		{
			m = k;
			for (l = 0;l <= i;l++,m++)
			{
				t = 0;
				if (w.charAt(m) != s.charAt(l))
				{
				t = 1;
				break;
				}
			}
			if (t == 0)
			{
				break;
			}

		}
		System.out.printf("%d",k);
	}
}

