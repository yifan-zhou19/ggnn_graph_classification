package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int max1;
	  int max2;
	  int i;
	  int d;
	  int e;
	  int f;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  d = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  e = Integer.parseInt(tempVar3);
	  }
	  max2 = e;
	  max1 = d;
	  if (d > e)
	  {
		max2 = d;
	   max1 = e;
	  }

		for (i = 2;i < n;i++)
		{
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  f = Integer.parseInt(tempVar4);
	  }
	  if (f > max2)
	  {
		max1 = max2;
	   max2 = f;
	  }
	else if (f <= max1)
	{
		;
	}
	else
	{
	max1 = f;
	}
		}
	System.out.printf("%d\n%d",max2,max1);
	return 0;
	}




}

