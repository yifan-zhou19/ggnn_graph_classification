package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		int[] b = new int[26];
		int[] c = new int[26];
		int i;
		int j;
		int l;
		int n;
		int m;
		int p;
		int q;
		int k = 0;
		n = 'a';
		m = 'z';
		p = 'A';
		q = 'Z';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a.charAt(i) == j + n)
				{
					b[j]++;
				}
				if (a.charAt(i) == j + p)
				{
					c[j]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'A',c[i]);
				k++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',b[i]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

