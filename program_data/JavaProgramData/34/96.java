package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		}
		do
		{
			if (n % 2 != 0)
			{
				k = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n", n, k);
				n = k;
			}
			if (n % 2 == 0)
			{
				j = n / 2;
				System.out.printf("%d/2=%d\n", n, j);
				n = j;
			}
		}while (n > 1);
		System.out.print("End");
		return 0;
	}


}

