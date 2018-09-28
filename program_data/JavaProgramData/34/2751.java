package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 1)
		{
		for (i = 0;;i++)
		{
			if (n % 2 == 1)
			{
				x = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,x);
				if (x == 1)
				{
					break;
				}
				n = x;
			}
			else
			{
				x = n / 2;
				System.out.printf("%d/2=%d\n",n,x);
				if (x == 1)
				{
					break;
				}
				n = x;
			}
		}
		}
		System.out.print("End");
	}

}

