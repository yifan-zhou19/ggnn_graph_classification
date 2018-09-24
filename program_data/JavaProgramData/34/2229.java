package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
		if (n == 1)
		{
			System.out.print("End\n");
			break;
		}
		else
		{
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.printf("%d/2=%d\n",n,m);
				n = m;
				m = 0;
			}
			else
			{
				m = 3 * n + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
				n = m;
				m = 0;
			}
		}
	}

	return 0;
	}

}

