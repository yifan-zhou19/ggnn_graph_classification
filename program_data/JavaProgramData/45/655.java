package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		String x = new String(new char[51]);
		int i;
		int j;
		int k;
		int a;
		int b;
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
		a = s.length();
		b = w.length();
		for (i = 0;i <= b - a;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i, k = 0;w.charAt(j) == s.charAt(k) && k < a;)
				{
					j++;
					k++;
				}
				if (k == a)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

