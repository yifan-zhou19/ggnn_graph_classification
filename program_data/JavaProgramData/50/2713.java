package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m;
		int d = 12;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= 12;m++)
		{
						  if (m - 1 == 1 || m - 1 == 3 || m - 1 == 5 || m - 1 == 7 || m - 1 == 8 || m - 1 == 10)
						  {
							 d = d + 31;
						  }
						  else if (m - 1 == 0)
						  {
								  d = d + 0;
						  }
							   else if (m - 1 == 2)
							   {
									   d = d + 28;
							   }
									else
									{
										d = d + 30;
									}
						  if ((d + w) % 7 == 5)
						  {
							 System.out.printf("%d\n",m);
						  }

		}
	}

}

