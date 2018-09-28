package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	if (m == 1)
	{
	System.out.print("End");
	}
	else
	{
		while (m != 1)
		{
			if ((m - 2 * (m / 2)) != 0)
			{
			System.out.printf("%d*3+1=%d\n",m,m * 3 + 1);
		 m = m * 3 + 1;
			}
		   if ((m - 2 * (m / 2)) == 0)
		   {
			System.out.printf("%d/2=%d\n",m,m / 2);
			  m = m / 2;
		   }
		}
		System.out.print("End");
	}


	}

}

