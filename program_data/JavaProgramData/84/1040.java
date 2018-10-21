package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int m;
		int i;
		int num;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i <= a)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
			n = 0,m = num;
			}
			else
			{
			if ((num > m) && (num > n))
			{
				n = m,m = num;
			}
			else if ((num < m) && (num> n))
			{
				n = num;
			}
			}
			i = i + 1;
		}
		System.out.printf("%d\n%d",m,n);
				return 0;
	}
}

