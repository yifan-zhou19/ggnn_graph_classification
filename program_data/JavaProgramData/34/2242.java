package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			if (n % 2 == 1)
			{
				k = n;
				n = 3 * n + 1;
				System.out.printf("%d*3+1=%d\n",k,n);
			}
			else
			{
				k = n;
				n /= 2;
				System.out.printf("%d/2=%d\n",k,n);
			}
		}
		System.out.print("End\n");
	}
}

