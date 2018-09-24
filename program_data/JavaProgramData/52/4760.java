package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[1000];
	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			s[i + m] = s[i];
		}
		for (i = 0;i < m;i++)
		{
			s[i] = s[i + n];
		}
		System.out.printf("%d",s[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
		return 0;
	}

}

