package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (n != 1)
			{
				if (n % 2 != 0)
				{
					a = n * 3 + 1;
					System.out.printf("%d*3+1=%d\n",n,a);
				}
				else
				{
					a = n / 2;
					System.out.printf("%d/2=%d\n",n,a);
				}
				n = a;
			}
			System.out.print("End\n");
		}
		return 0;
	}













}

