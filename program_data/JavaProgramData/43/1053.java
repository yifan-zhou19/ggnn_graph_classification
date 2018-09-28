package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 2;
		int j = 2;
		int a;
		int b;
		int n;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		n = m / 2;
		while (i <= n)
		{
					k = 2;
					l = 2;
					while (k <= i)
					{
								if (i % k == 0)
								{
								break;
								}
								else
								{
								k++;
								}
					}
					if (k == i)
					{
							 j = m - i;
							 while (l <= j)
							 {
										 if (j % l == 0)
										 {
										 break;
										 }
										 else
										 {
										 l++;
										 }
							 }
							 if (l == j)
							 {
							 System.out.printf("%d %d\n",i,j);
							 }
							 i++;
					}
					else
					{
						 i++;
						 continue;
					}
		}
		return 0;
	}
}

