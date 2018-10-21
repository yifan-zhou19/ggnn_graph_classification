package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int last = 1;
	float m = 1F;
	int M;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	   for (i = 0;i < 2 * n - 1;i++)
	   {
		   if (i % 2 == 0)
		   {
			  m = m * n + k;
		   }
			  else
			  {
					m = m / (n - 1);
					M = m;
					if ((m - M) != 0)
					{
					  last += 1;
					  m = last;
					  i = -1;
					  continue;
					}
			  }
	   }
	System.out.printf("%.0f",m);
	return 0;
	}
}

