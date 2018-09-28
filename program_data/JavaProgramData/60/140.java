package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int p;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		 for (i = 2;i < n - 1;i++)
		 {
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
				else
				{
					k++;
				}
			}
			if (k == i - 2)
			{
				p = i + 2;
				for (j = 2;j < p;j++)
				{
					if (p % j == 0)
					{
						break;
					}
					else
					{
						l++;
					}
				}
				if (l == p - 2)
				{
					System.out.printf("%d %d\n",i,p);
				}
			}
			k = 0;
			l = 0;
		 }

	}
}

