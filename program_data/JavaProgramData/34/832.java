package <missing>;

public class GlobalMembers
{
	public static void work(int n)
	{
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			if (n % 2 == 1)
			{
				int a = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,a);
				n = a;
				work(n);
			}
			else
			{
				int a = n / 2;
				System.out.printf("%d/2=%d\n",n,a);
				n = a;
				work(n);
			}
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		work(n);
		return 0;
	}

}

