package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int m;
		int n;
		int i;
		int j;
		int k;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i <= n - 1;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				for (k = 0,j = i;a.charAt(k) == b.charAt(j);k++,j++)
				{
					if (k == m - 1)
					{
						x = 1;
						System.out.printf("%d\n",j + 1 - m);
						break;
					}
				}
				if (x == 1)
				{
					break;
				}
			}
		}
	}



}

