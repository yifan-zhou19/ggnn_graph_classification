package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 10000000;i++)
		{
			if (n == 1)
			{
				break;
			}
			else
			{
				if (n % 2 == 0)
				{
					j = n;
					k = j / 2;
					System.out.printf("%d/2=%d\n",j,k);
					n = k;
				}
				else
				{
					j = n;
					k = j * 3 + 1;
					System.out.printf("%d*3+1=%d\n",j,k);
					n = k;
				}
			}
		}
		System.out.print("End\n");
		return 0;
	}
}

