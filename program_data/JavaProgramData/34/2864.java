package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 if (!(n == 1))
			 {
		  do
		  {
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.printf("%d/2=%d\n",n,m);
			}
			else
			{
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
			}
			n = m;
		  } while (!(n == 1));
			 }
		System.out.print("End");
		return 0;
	}
}

