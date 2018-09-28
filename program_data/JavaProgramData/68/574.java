package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int m;
	 int j;
	 int y;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i = i + 2)
	 {
	  for (m = 3;m <= i / 2;m = m + 2)
	  {
		for (j = 3;j <= Math.sqrt(m);j += 2)
		{
		 if (m % j == 0)
		 {
			 break;
		 }
		}
		if (j <= Math.sqrt(m))
		{
			continue;
		}
		y = i - m;
		for (j = 3;j <= Math.sqrt(y);j += 2)
		{
		  if (y % j == 0)
		  {
			  break;
		  }
		}
		if (j > Math.sqrt(y))
		{
		System.out.printf("%d=%d+%d\n",i,m,y);
		break;
		}
	   else
	   {
		  continue;
	   }
	  }

	 }
	}

}

