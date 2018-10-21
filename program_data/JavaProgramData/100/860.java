package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		int[] sz = new int[26];
		int i;
		int m;
		int k;
		int t;
		char n;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		m = zfc.length();
		for (k = 0;k < 26;k++)
		{
			sz[k] = 0;
		}
		for ((n = 97,k = 0);(n < 123 && k < 26);(n++,k++))
		{
			for (i = 0;i < m;i++)
			{
				if (zfc.charAt(i) == n)
				{
					sz[k]++;
				}
			}
			if (sz[k] > 0)
			{
				System.out.printf("%c=%d\n",n,sz[k]);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

