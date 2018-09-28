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
		for (i = 1;n != 1;i++)
		{
			if (n % 2 == 1)
			{
				System.out.printf("%d",n);
				n = 3 * n + 1;
				System.out.printf("*3+1=%d\n",n);
			}
			else
			{
				System.out.printf("%d",n);
				n = n / 2;
				System.out.printf("/2=%d\n",n);
			}
		}
		System.out.print("End");
		return 0;
	}

}

