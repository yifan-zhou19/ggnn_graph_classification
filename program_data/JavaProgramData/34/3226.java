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
			for (i = 0;i < m;i++)
			{
				if (m == 1)
				{
					break;
				}
			while (m > 1)
			{
		   if (m % 2 == 1)
		   {
			   n = m,m = m * 3 + 1,System.out.printf("%d*3+1=%d\n",n,m);
		   }
			else
			{
				n = m,m = m / 2,System.out.printf("%d/2=%d\n",n,m);
			}

			}
			}
				System.out.print("End");
	}

}

