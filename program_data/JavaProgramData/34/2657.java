package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			r = n % 2;
			if (r == 0)
			{

				System.out.printf("%d/2=%d\n",n,n / 2);
				n = n / 2;
			}
			if (r != 0)
			{
				System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				n = n * 3 + 1;
			}
		}
		System.out.print("End");
	}
}

