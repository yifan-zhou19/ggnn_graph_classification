package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int p;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n;i++)
		{
			p = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					p++;
				}

			}
			if (p == i - 2)
			{
				if (i + 2 <= n)
				{
					p = 0;
					for (j = 2;j < i + 2;j++)
					{
					   if ((i + 2) % j != 0)
					   {
						   p++;
					   }
					}
					if (p == i)
					{
						System.out.printf("%d %d\n",i,i + 2);
						  k++;
					}
				}
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}


	}
}

