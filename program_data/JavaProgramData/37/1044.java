package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int t;
		String s = new String(new char[100000]);
		int[] sz = new int[26];
		for (i = 0;i < 25;i++)
		{
			sz[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (j = 0;j < l;j++)
			{
				t = (int)(s.charAt(j) - 'a');
				sz[t]++;
			}
			for (j = 0;j < l;j++)
			{
				t = (int)(s.charAt(j) - 'a');
				if (sz[t] == 1)
				{
					System.out.printf("%c\n",s.charAt(j));
					break;
				}
				if (j == l - 1)
				{
					System.out.print("no\n");
				}
			}
			for (j = 0;j < 25;j++)
			{
				sz[j] = 0;
			}
		}
		return 0;
	}


}

