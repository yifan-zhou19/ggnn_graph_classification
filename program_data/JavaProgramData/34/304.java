package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			if (m == 1)
			{
				break;
			}
			else if (m % 2 == 1)
			{
				n = m * 3 + 1;
				System.out.printf("%d*3+1=%d\n",m,n);
				m = n;
				if (m == 1)
				{
					break;
				}
			}
			else
			{
				n = m / 2;
				System.out.printf("%d/2=%d\n",m,n);
				m = n;
				if (m == 1)
				{
					break;
				}

			}
		}
		System.out.print("End");

		return 0;


	}

}

