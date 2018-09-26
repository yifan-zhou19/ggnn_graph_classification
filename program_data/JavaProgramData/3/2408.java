package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int i;
	  int j;
	  int[] a = new int[max];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  i = 0;
	  while (i < n)
	  {
		  j = 1;
		  while (j < n)
		  {
			  if (a[i] == k - a[j])
			  {
			  System.out.print("yes");
			  break;
			  }
			  j++;
		  }
		  if (a[i] == k - a[j])
		  {
		  break;
		  }
		  i++;
	  }
	  if (i == n)
	  {
	  System.out.print("no");
	  }
	  return 0;
	}
}

