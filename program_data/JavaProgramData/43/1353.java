package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i++)
	  {
		 for (j = 2;j <= i;j++)
		 {
			if (i % j == 0)
			{
				break;
			}
		 }
		 if (j == i)
		 {
			for (j = 2;j <= m - i;j++)
			{
			   if ((m - i) % j == 0)
			   {
				   break;
			   }
			}
			if (j == m - i)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		 }
	  }
	}

}

