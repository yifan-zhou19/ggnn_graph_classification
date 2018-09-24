package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] arr;
	  int n;
	  int i;
	  int k;
	  int a;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		arr = new int[a];
		for (k = 0;k < a;k++)
		{
		  if (k == 0 || k == 1)
		  {
			 arr[k] = 1;
		  }
		  else
		  {
			  arr[k] = arr[k - 1] + arr[k - 2];
		  }
		}
		 System.out.printf("\n%d\n",arr[a - 1]);
	  }

	  return 0;
	}
}

