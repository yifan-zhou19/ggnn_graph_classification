package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 1)
		{
		  do
		  {
			if (n % 2 == 1)
			{
				x = 0;
				x = 3 * n + 1;
				System.out.printf("%d*3+1=%d\n",n,x);
				n = x;
			}
			else if (n % 2 == 0)
			{
				y = 0;
				y = n / 2;
				System.out.printf("%d/2=%d\n",n,y);
				n = y;
			}
		  }while (n > 1);
		System.out.print("End");
		}
		else if (n = 1)
		{
		System.out.print("End");
		}
		return 0;
	}


}

