package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int e;
		int js;
		int t;
		String s = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			e = s.length();
			int[] zifu = new int[100001];
			for (j = 0;j < e-1;j++)
			{
				js = 1;
				for (k = j + 1;k < e;k++)
				{
					if (s.charAt(j) == s.charAt(k))
					{
						zifu[j] = js;
						zifu[k] = js;
					}
				}
			}
			for (j = 0;j < e;j++)
			{
				if (zifu[j] == 0)
				{
					System.out.printf("%c\n",s.charAt(j));
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

