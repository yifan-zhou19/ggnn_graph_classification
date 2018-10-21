package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int m;
	  int i;
	  int j;
	  int flag1;
	  int flag2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i += 2)
	  {
		  flag1 = 1;
		  flag2 = 1;
		  for (j = 2;j <= i - 1;j++)
		  {
			  if (i % j == 0)
			  {
				  flag1 = 0;
				  break;
			  }
		  }
		  for (j = 2;j <= m - i - 1;j++)
		  {
			  if ((m - i) % j == 0)
			  {
				  flag2 = 0;
				  break;
			  }
		  }
		  if ((flag1 == 1) && (flag2 == 1))
		  {
		  System.out.printf("%d %d\n",i,m - i);
		  }
	  }

	}

}

