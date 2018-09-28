package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			if (n % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",n,n / 2);
				n = n / 2;
				f(n);
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				n = n * 3 + 1;
				f(n);
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
		f(n);
	}


}

