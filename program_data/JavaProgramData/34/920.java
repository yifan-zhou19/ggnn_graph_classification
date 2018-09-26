package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i > 0;i++)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			if (n % 2 == 0)
			{
				n = n / 2;
				System.out.printf("%d/2=%d\n",2 * n,n);
				continue;
			}
			else
			{
				System.out.printf("%d",n);
				n = n * 3 + 1;
				System.out.printf("*3+1=%d\n",n);
				continue;
			}
		}
		return 0;
	}
}

