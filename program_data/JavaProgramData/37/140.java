package <missing>;

public class GlobalMembers
{
	public static int[] use = new int[26];
	public static String s = new String(new char[1000010]);
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 26;i++)
			{
				use[i] = -1;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int l = s.length();
			for (i = 0;i < l;i++)
			{
				if (use[s.charAt(i) - 'a'] >= 0)
				{
					use[s.charAt(i) - 'a'] = -2;
				}
				if (use[s.charAt(i) - 'a'] == -1)
				{
					use[s.charAt(i) - 'a'] = i;
				}
			}
			int minnum = 10000000;
			char minn = -1;
			for (i = 0;i < 26;i++)
			{
				if (use[i] >= 0 && use[i] < minnum)
				{
					minnum = use[i],minn = i + 'a';
				}
			}
			if (minn == -1)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",minn);
			}
		}
		return 0;
	}

}

