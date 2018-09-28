package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int jiao = int;
		if (m != 1)
		{
		do
		{
		   if (m % 2 == 1)
		   {
				 n = m * 3 + 1;
				 System.out.printf("%d*3+1=%d\n",m,n);
		   }
		if (m % 2 == 0)
		{
				  n = m / 2;
				  System.out.printf("%d/2=%d\n",m,n);
		}
		m = n;
		} while (n != 1);
		}
		System.out.print("End");
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

