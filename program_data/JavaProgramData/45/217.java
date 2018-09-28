package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int m;
		int n;
		int i;
		int j;
		int k;
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
		m = w.length();
		n = s.length();
		for (i = 0;i < m;i++)
		{
			k = i;
			for (j = 0;j < n;j++,i++)
			{
				if (s.charAt(j) != w.charAt(i))
				{
					break;
				}
			}
			i = k;
			if (j == n)
			{
				break;
			}
		}
		System.out.printf("%d\n",i);
	}
}

