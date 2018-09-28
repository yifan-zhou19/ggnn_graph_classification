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
		int j;
		int k;
		int m;
		int r;
		int x;
		int p;
		String a = new String(new char[100000]);
		for (i = 0;i < t;i++)
		{
			p = 0;
			int[] b = new int[100000];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			m = a.length();
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a.charAt(j) == 'a' + k)
					{
						x = k;
						break;
					}
				}
				for (r = 0;r < m;r++)
				{
					if (a.charAt(r) == 'a' + x)
					{
						b[j] = b[j] + 1;
					}
				}
				if (b[j] == 1)
				{
					p = 1;
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("no\n");
			}
		}
	}


}

