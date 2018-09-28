package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int max = 0;
	 int sum = 0;
	int i;
	int n;
	int[] ss = new int[100];
	int[] sz = new int[100];

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ss[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar3);
		  }

	  }

	  for (i = 0;i < n;i++)
	  {

		  if (ss[i] >= 90 && ss[i] <= 140 && sz[i] >= 60 && sz[i] <= 90)
		  {

		   sum++;
		  }
		  else
		  {
			  max = max >= sum != 0? max:sum;
			  sum = 0;
			  continue;
		  }
	  }
	  max = max >= sum != 0? max:sum;
	System.out.printf("%d",max);
	return 0;
	}
}

