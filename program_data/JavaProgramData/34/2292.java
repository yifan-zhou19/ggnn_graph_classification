package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
			return 0;
		}
		int a = n;
		for (;a != 1;)
		{
			if (a % 2 != 0)
			{
				a = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,a);
				n = a;
			}
			else
			{
				a = n / 2;
				System.out.printf("%d/2=%d\n",n,a);
				n = a;
			}
		}
		System.out.print("End\n");
		return 0;
	}




}

