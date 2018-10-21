package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			while (n % 2 == 0)
			{
				System.out.printf("%d/%d=%d\n",n,2,n / 2);
			n = n / 2;
			}
			if (n == 1)
			{
				break;
			}
			else
			{
				System.out.printf("%d*%d+%d=%d\n",n,3,1,(n * 3 + 1));
				n = n * 3 + 1;
			}
		}
		System.out.print("End\n");
	}
}

