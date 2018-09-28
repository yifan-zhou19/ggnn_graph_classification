package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i = 0;
		int max1 = 0;
		int max2 = 0;
		int tmp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		   for (i = 0; i < n; i++)
		   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m > max1)
			{
				tmp = max1;
				max1 = m;
				max2 = tmp;
			}
			else
			{
				if (m < max1 && m> max2)
				{
					max1 = max1;
					max2 = m;
				}
				else
				{
					max1 = max1;
					max2 = max2;
				}
			}
		   }
		System.out.printf("%d\n", max1);
			 System.out.printf("%d\n", max2);
		return 0;
	}
}

