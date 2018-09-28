package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	 int panduan = int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	   for (i = 6;i <= n;i++)
	   {
		  if (i % 2 == 0)
		  {
				System.out.printf("\n%d=",i);
			  for (j = 2;j <= i;j++)
			  {
				 if (panduan(j) == 1 && panduan(i - j) == 1)
				 {
					 System.out.printf("%d+%d",j,i - j);
				  break;
				 }
			  }
		  }
	   }
	}
	public static int panduan(x UnnamedParameter)
	{
		int a;
	  if (x == 2 || x == 3)
	  {
		  return 1;
	  }
	  else
	  {
	  {
		  for (a = 2;a <= Math.sqrt(x);a++)
		  {
		if ((x % a) == 0)
		{
			break;
		}
		  }
   }
		if ((x % a) == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	  }
	}

}

