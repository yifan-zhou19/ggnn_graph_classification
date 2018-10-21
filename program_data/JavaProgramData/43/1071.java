package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int mod;
		int h = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		//????
		for (i = 3;i <= m / 2;i = i + 2)
		{
							  for (j = 2;j < i;j = j + 1)
							  {
							  mod = i % j;
							  if (mod == 0)
							  {
								  h = 0;
							  }
							  }
							  if (h != 0)
							  {
										  for (k = 2;k < (m - i);k = k + 1)
										  {
																 mod = (m - i) % k;
																 if (mod == 0)
																 {
																	 h = 0;
																 }
										  }
										  if (h != 0)
										  {
													  System.out.printf("%d %d\n",i,m - i);
										  }

							  }
							  h = 1;

		}


	  return 0;
	}

}

