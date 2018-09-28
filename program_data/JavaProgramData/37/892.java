package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100001]);
		int t;
		int n;
		int i;
		int j;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int[] s = new int[100001];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			n = a.length();
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
						s[j] += 1;
					}
				}
			}
			for (p = 0;p < n;p++)
			{
				if (s[p] == 1)
				{
					System.out.printf("%c\n",a.charAt(p));
					break;
				}
			}
			if (p == n)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

