package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  int temp;
	  int i = 0;
	  int[] x = new int[a];
	  int b;
	  int de;
	  b = a - 1;
	  for (i = 0;i < a;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   x[i] = Integer.parseInt(tempVar2);
	   }
	   if (x[0] < x[i] && i < a)
	   {
		temp = x[0];
		x[0] = x[i];
		x[i] = temp;
	   }
	  }
	  for (i = 1;i < a;i++)
	  {
	   if (x[1] < x[i])
	   {
		  de = x[1];
		  x[1] = x[i];
		  x[i] = de;
	   }
	  }
	  System.out.printf("%d\n%d\n",x[0],x[1]);
	  return 0;
	}



}

