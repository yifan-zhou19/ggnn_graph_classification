package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int s;
	int t;
	int p;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i = i + 2)
	{
		for (s = 3;s < i;s = s + 2)
		{
			for (t = 2;t < Math.sqrt(s) + 1;t++)
			{
					if (s % t == 0)
					{
					break;
					}
				 if (t >= Math.sqrt(s))
				 {
						j = i - s;
					 for (p = 2;p < Math.sqrt(j) + 1;p++)
					 {
							if (j % p == 0)
							{
							 break;
							}
						 if (p >= Math.sqrt(j))
						 {
							 System.out.printf("%ld=%ld+%ld\n",i,s,j);
						 s = i - 1;
						 }
					 }
				 }
			}
		}
	}

	}
}

