package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int[] a = new int[1001];
	  int b = 0;
	  int c = 0;
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
	  for (int i = 0;i < n;i++)
	  {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
	  }
	  for (int j = 0;j < n;j++)
	  {
			 for (int m = n - 1;m >= 1;m--)
			 {
				  if (a[m] + a[j] == k && m != j)
				  {
					  System.out.print("yes");
					 b = a[m];
					 c = a[j];
					 break;
				  }

	  if (b + c == k)
	  {
		  break;
	  }
	  if (j == n - 1)
	  {
		  System.out.print("no");
		  break;
	  }
			 }
	  }
		  return 0;
	}
}

