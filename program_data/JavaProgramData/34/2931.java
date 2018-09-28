package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i >= 0;i++)
		{
			if (n == 1)
			{
				System.out.print("End\n");
				break;
			}
			else if (n % 2 != 0)
			{
				d = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,d);
			}
			else if (n % 2 == 0)
			{
				d = n / 2;
				System.out.printf("%d/2=%d\n",n,d);
			}
			n = d;
		}
		return 0;
	}
}

