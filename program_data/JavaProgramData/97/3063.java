package <missing>;

public class GlobalMembers
{
	public static int[] a = {100, 50, 20, 10, 5, 1, 0, 0, 0, 0};
	public static int Main()
	{
	  int n;
	  int k;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  k = 0;
	 for (i = 0;i < 6;i++)
	 {
	  while (n >= a[i])
	  {
		  n -= a[i];
		  k++;
	  }
	  System.out.printf("%d\n",k);
	  k = 0;
	 }
	 return 0;
	}

}

