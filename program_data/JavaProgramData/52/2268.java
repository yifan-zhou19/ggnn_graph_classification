package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int N;
		int i;
		int[] s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		s = new int[N];
		for (i = m;i < N;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < N;i++)
		{
	if (i < N - 1)
	{
		System.out.printf("%d ",s[i]);
	}
	else
	{
		System.out.printf("%d",s[i]);
	}
		}
		return 0;
	}
}

