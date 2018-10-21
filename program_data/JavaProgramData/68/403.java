package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int k;
	 int t;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i = i + 2)
	 {
	  if (i % 2 == 0)
	  {
		for (j = 3;j <= (int)(i / 2);j++)
		{
		 for (k = 2;k <= Math.sqrt(j);k++)
		 {
		  if (j % k == 0)
		  {
			  break;
		  }
		 }
		 if (k > Math.sqrt(j))
		 {
			for (t = 2;t <= Math.sqrt(i - j);t++)
			{
			 if ((i - j) % t == 0)
			 {
				 break;
			 }
			}
		 }
		  if (k > Math.sqrt(j) && t > Math.sqrt(i - j))
		  {
			  System.out.printf("%d=%d+%d\n",i,j,i - j);
			  break;
		  }
		}
	  }
	 }
	}



}

