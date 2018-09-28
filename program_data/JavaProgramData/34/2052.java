package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			if (n % 2 == 1)
			{
				t++;
				int e = n;
				n = 3 * n + 1;
				if (t == 1)
				{
					System.out.printf("%d*3+1=%d",e,n);
				}
				else if (t > 1)
				{
					System.out.printf("\n%d*3+1=%d",e,n);
				}

			}
			else
			{
				t++;
				int e = n;
				n = n / 2;
				if (t == 1)
				{
					System.out.printf("%d/2=%d",e,n);
				}
				else if (t > 1)
				{
					System.out.printf("\n%d/2=%d",e,n);
				}
			}
		}
		System.out.print("\nEnd");


		return 0;

	}




}

