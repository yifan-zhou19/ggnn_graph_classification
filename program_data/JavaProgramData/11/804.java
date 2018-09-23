package <missing>;

public class GlobalMembers
{
	public static int f(int y)
	{
		int i;
		if (y % 4 == 0)
		{
				  if (y % 100 == 0)
				  {
							  if (y % 400 == 0)
							  {
								return (1);
							  }
							  else
							  {
								return (0);
							  }
				  }
				  else
				  {
				   return (1);
				  }
		}
		 else
		 {
		  return (0);
		 }
	}
	public static int Main()
	{
		  int y;
		  int m;
		  int d;
		  int n;
		  int i;
		  int[] a = new int[13];
		  a[1] = 31;
		  a[3] = 31;
		  a[4] = 30;
		  a[5] = 31;
		  a[6] = 30;
		  a[7] = 31;
		  a[8] = 31;
		  a[9] = 30;
		  a[10] = 31;
		  a[11] = 30;
		  a[12] = 30;
		  n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  y = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  d = Integer.parseInt(tempVar3);
		  }
		  if (f(y) == 0)
		  {
			  a[2] = 28;
		  }
		  if (f(y) == 1)
		  {
			  a[2] = 29;
		  }
		   for (i = 1;i < m;i++)
		   {
			   n = a[i] + n;
		   }
		  n = n + d;
		  System.out.printf("%d",n);
		  System.in.read();
		  System.in.read();
	}

}

