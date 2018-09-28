package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int l;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  int res1;
		  int res2;
		  res1 = res2 = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] == 0)
						  {
									 if (b[i] == 1)
									 {
										 res1++;
									 }
									 if (b[i] == 2)
									 {
										 res2++;
									 }
						  }
						  if (a[i] == 1)
						  {
									 if (b[i] == 0)
									 {
										 res2++;
									 }
									 if (b[i] == 2)
									 {
										 res1++;
									 }
						  }
						  if (a[i] == 2)
						  {
									 if (b[i] == 0)
									 {
										 res1++;
									 }
									 if (b[i] == 1)
									 {
										 res2++;
									 }
						  }
		  }
		  if (res1 == res2)
		  {
			  System.out.print("Tie");
		  }
		  if (res1 > res2)
		  {
			  System.out.print("A");
		  }
		  if (res1 < res2)
		  {
			  System.out.print("B");
		  }

	}

}

