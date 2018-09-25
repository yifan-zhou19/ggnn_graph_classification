package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int u;
		int n;
		int[] b = new int[N];
		String a = new String(new char[N]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		b[0] = 1;
		for (i = 1;i < n;i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
				b[i] = 1;
			}
			if (a.charAt(i) != a.charAt(0))
			{
				b[i] = 2;
			}
		}
		u = n / 2;
		while (u-- != 0)
		{
			for (j = 0;j < n;j++)
			{
				if (b[j] == 2)
				{
					for (i = j;i >= 0;i--)
					{
						if (b[i] == 1)
						{
							break;
						}
					}
						System.out.printf("%d %d\n",i,j);
						b[i] = 0;
						b[j] = 0;
				}
			}
		}
			return 0;
	}
}

