package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m1;
		int m2;
		int a;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		m1 = s[0];
		m2 = s[0];
		for (i = 0;i < n;i++)
		{
			if (m1 < s[i])
			{
				m1 = s[i];
				a = i;
			}
		}
		s[a] = s[n - 1];
		s[n - 1] = m1;
		for (i = 0;i < n - 1;i++)
		{
			if (m2 < s[i])
			{
				m2 = s[i];
			}
		}
		System.out.printf("%d\n",m1);
		System.out.printf("%d\n",m2);
		return 0;
	}


}

