package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			System.exit(1);
		}
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				k = n / 2;
				System.out.printf("%d/2=%d\n",n,k);
				n = k;
			}
			else
			{
				k = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,k);
				n = k;
			}
		}
		System.out.print("End");
	}
}

