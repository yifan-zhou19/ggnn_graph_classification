package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int p;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		i = 2;
		p = 0;
		while (i <= n)
		{
			i = i + 1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (m <= j)
			{
				p = m;
				m = j;
			}
			else if (p < j)
			{
				m = m;
				p = j;

			}
		}
		System.out.printf("%d\n%d",m,p);
		return 0;
	}
}

