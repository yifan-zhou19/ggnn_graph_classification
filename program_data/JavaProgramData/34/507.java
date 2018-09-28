package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		int b = 0;
		int c;
		int d = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			for (i = 0;;i++)
			{
				if (n == 1)
				{
					System.out.print("End");
					break;
				}
				else
				{
					if (n % 2 == 0)
					{
						System.out.printf("%d/2=%d\n",n,n / 2);
						n = n / 2;
					}
					else
					{
						System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
						n = n * 3 + 1;
					}
				}
			}
		}
		return 0;
	}


}

