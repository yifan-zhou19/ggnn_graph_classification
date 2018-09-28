package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int i = 1;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (i <= a)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
				if (b >= m)
				{
					n = m;
					m = b;
				}
				if (b < m && b> n)
				{
					n = b;
				}
				i++;
		}
			System.out.printf("%d\n",m);
			System.out.printf("%d\n",n);


	}
}

