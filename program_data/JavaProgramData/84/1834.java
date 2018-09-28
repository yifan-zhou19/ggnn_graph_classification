package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int m;
	  int x;
	  int y;
	  int z;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[255];
	  for (i = 1;i <= m;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	  }
	  x = a[1];
	  y = a[2];
	  if (a[2] < a[1])
	  {
		  z = a[1];
		  a[1] = a[2];
		  a[2] = z;
	  };
	  for (i = 3;i <= m;i++)
	  {
		  if (a[i] > x)
		  {
			  x = a[i];
		  }
		  if (x > y)
		  {
			  z = y;
			  y = x;
			  x = z;
		  };
	  }
	  System.out.printf("%d\n%d",y,x);
	return 0;
	}

}

