package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int first;
		int second;
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 1 && n < 100)
		{
			if (n == 1)
			{
				int a;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				first = second = a;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   x = Integer.parseInt(tempVar3);
				   }
					if (i == 0)
					{
						first = x;
						second = 0;
					}
					else
					{
						if (first < x)
						{
							second = first;
							first = x;
						}
						else if (second < x)
						{
							first = first;
							second = x;
						}
					}

				}
			}
			System.out.printf("%d\n%d",first,second);
		}
	return 0;
	}
}

