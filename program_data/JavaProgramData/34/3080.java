package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
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
			do
			{
				i = n % 2;
				if (i == 1)
				{
					a = n * 3 + 1;
					System.out.printf("%d*3+1=%d\n",n,a);
					n = a;
				}
				else
				{
					b = n / 2;
					System.out.printf("%d/2=%d\n",n,b);
					n = b;
				}
			} while (n != 1);
			System.out.print("End");
		}
		return 0;
	}

}

