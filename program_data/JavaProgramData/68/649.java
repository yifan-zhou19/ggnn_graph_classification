package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int pan;
	  int x1;
	  int x2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i += 2)
	  {
		  for (j = 3;j <= i;j += 2)
		  {
			  pan = Math.sqrt(j);
			  for (k = 3;k <= pan;k += 2)
			  {
				  if (j % k == 0)
				  {
					  break;
				  }
			  }
			  if (k >= pan + 1)
			  {
				  x2 = i - j;
				  pan = Math.sqrt(x2);
				  for (k = 3;k <= pan;k += 2)
				  {
					 if (x2 % k == 0)
					 {
						 break;
					 }
				  }
				  if (k >= pan + 1)
				  {
					  break;
				  }
			  }
		  }
		System.out.printf("%d=%d+%d\n",i,j,x2);
	  }
	}
}

