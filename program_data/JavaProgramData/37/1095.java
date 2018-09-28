package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		String a = new String(new char[100000]);
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int[] zimu = new int[26];
			int k;
			int len;
			int cache;
			len = a.length();
			for (k = 0;k < len;k++)
			{
				cache = a.charAt(k) - 'a';
				zimu[cache] = zimu[cache] + 1;
			}
			for (k = 0;k < len;k++)
			{
				if (zimu[a.charAt(k) - 'a'] == 1)
				{
					System.out.printf("%c\n",a.charAt(k));
					break;
				}
			}
			if (k == len)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

