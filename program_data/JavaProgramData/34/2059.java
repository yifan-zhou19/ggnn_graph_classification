package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;n != 1;i++)
		{
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.printf("%d/2=%d\n",n,m);
				n /= 2;
			}
			else if (n % 2 != 0)
			{
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
				n = n * 3 + 1;
			}
		}
		System.out.print("End");
		return 0;
	}

}

