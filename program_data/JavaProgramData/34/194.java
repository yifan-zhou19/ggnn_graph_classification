package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			do
			{
				if (n % 2 != 0)
				{
					c = n * 3 + 1;
					System.out.printf("%d*3+1=%d\n",n,c);
				}
				else
				{
					c = n / 2;
					System.out.printf("%d/2=%d\n",n,c);
				}
				n = c;
			}while (c > 1);
			System.out.print("End\n");
		}
	}

}

