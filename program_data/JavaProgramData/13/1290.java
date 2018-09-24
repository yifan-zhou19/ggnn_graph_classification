package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  int sum = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] x = new int[n];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[i] = Integer.parseInt(tempVar2);
		  }
		  for (k = 0;k < i;k++)
		  {
			  if (x[k] == x[i])
			  {
				 i--;
				 n--;
				 break;
			  }
		  }
	  }
	  System.out.printf("%d",x[0]);
	  for (i = 1;i < n;i++)
	  {
		  System.out.printf(" %d",x[i]);
	  }
	  return 0;
	}

}

