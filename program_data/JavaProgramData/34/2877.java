package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 1)
		{
		 for (;;)
		 {
			if (n % 2 == 0)
			{
				p = n / 2;
				System.out.printf("%d/2=%d\n",n,p);
				n = p;
				if (n == 1)
				{
					break;
				}
			}
			else
			{
				p = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,p);
				n = p;
				if (n == 1)
				{
					break;
				}
			}
		 }
		}
			System.out.print("End");
			return 0;
	}
}

