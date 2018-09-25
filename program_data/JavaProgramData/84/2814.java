package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int max;
	  int secondmax;
	  int n;
	  int t;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  x = Integer.parseInt(tempVar2);
	  }
	  secondmax = max = x;
		  for (i = 1;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  t = Integer.parseInt(tempVar3);
			  }
			  if (t > max)
			  {
				  secondmax = max;
				  max = t;
			  }
			  else if (t > secondmax)
			  {
				  secondmax = t;
			  }
			  else if ((max == secondmax) && (i == 1))
			  {
				  t = secondmax;
			  }
		  }
	   System.out.printf("%d\n%d\n",max,secondmax);
	   return 0;
	}
}

