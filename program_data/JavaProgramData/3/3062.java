package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int i;
	  int j;
	  int s = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  int[] a = new int[n];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  if (i == j)
			  {
				 j++;
			  }
			  if (a[i] + a[j] == k)
			  {
				 s++;
			  }
		  }
	  }
	   if (s == 0)
	   {
		  System.out.print("no");
	   }
	   else
	   {
		  System.out.print("yes");
	   }
	   return 0;
	}
}

