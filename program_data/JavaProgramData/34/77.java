package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int result = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;1;i++)
		{
			if (n == 1)
			{
				System.out.print("End\n");
				break;
			}
			if (n % 2 == 0)
			{
				result = n / 2;
				System.out.printf("%d/2=%d\n",n,result);
				n = result;
			}
			else if (n % 2 == 1)
			{
				result = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,result);
				n = result;
			}

		}
		return 0;
	}
}

