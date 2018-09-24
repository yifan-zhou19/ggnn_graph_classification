package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
			return 0;
		}
		do
		{
			if (n > 1 && n % 2 != 0)
			{
				f = (n * 3) + 1;
				System.out.printf("%d*3+1=%d\n",n,f);
				n = (n * 3) + 1;
			}
			if (n > 1 && (n % 2) == 0)
			{
				f = n / 2;
				System.out.printf("%d/2=%d\n",n,f);
				n = n / 2;
			}
		}while (n > 1);
		System.out.print("End\n");
		return 0;
	}


}

