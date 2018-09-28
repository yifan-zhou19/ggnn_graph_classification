package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int n;
		int i;
		int j;
		int m;
		int k;
		int p;
		int q;
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
		k = 0;
		m = a.length();
		n = b.length();
		for (i = 0;i <= n - m;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				for (j = 0;j < m;j++)
				{
					if (a.charAt(j) == b.charAt(j + i))
					{
						k++;
					}
				}
				if (k == m)
				{
					System.out.printf("%d\n",i);
				}
			}
		}

	}


}

