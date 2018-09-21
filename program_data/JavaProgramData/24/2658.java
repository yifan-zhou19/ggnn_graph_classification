package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int max = 0;
		int p1;
		int min = 70;
		int p2;
		char[][] a = new char[203][40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) = tempVar2;
			}
		}
		for (i = 1;i <= n;i++)
		{
			m = String.valueOf(*(a + i)).length();
			if (m > max)
			{
				max = m;
				p1 = i;
			}
			if (m < min)
			{
				min = m;
				p2 = i;
			}
		}
		System.out.printf("%s\n%s",*(a + p1),*(a + p2));
		return 0;
	}
}

