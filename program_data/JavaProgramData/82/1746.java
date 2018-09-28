package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int a;
		int b;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i = i + 1)
		{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								a = Integer.parseInt(tempVar2);
							}
							String tempVar3 = ConsoleInput.scanfRead(" ");
							if (tempVar3 != null)
							{
								b = Integer.parseInt(tempVar3);
							}
							if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
							{
														m = m + 1;
							}
							else
							{
								 if (m > max)
								 {
									 max = m;
								 }

								 m = 0;
							}



		}
	  if (m > max)
	  {
		  max = m;
	  }
	  if (max == 0)
	  {
		  System.out.printf("%d\n",m);
	  }


	  else
	  {
		  System.out.printf("%d\n",max);
	  }

	  return 0;
	}

}

