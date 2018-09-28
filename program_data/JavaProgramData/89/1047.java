package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int[] a;
		  int[] b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = new int[n];
		  b = new int[n];
		  for (i = 0;i < n;i++)
		  {
						  a[i] = 0;
						  b[i] = 0;
		  }
		  k = 0;
		  l = 1;
		  while (k != 0 || l != 0)
		  {
								 String tempVar2 = ConsoleInput.scanfRead();
								 if (tempVar2 != null)
								 {
									 k = Integer.parseInt(tempVar2);
								 }
								 String tempVar3 = ConsoleInput.scanfRead(" ");
								 if (tempVar3 != null)
								 {
									 l = Integer.parseInt(tempVar3);
								 }
								 if (k == 0 && l == 0)
								 {
									 break;
								 }
								 a[k] = 1;
								 b[l] = 1;
		  }
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
			   if (a[i] == 0 && b[i] == 1)
			   {
							System.out.printf("%d\n",i);
							k++;
			   }
		  }
		  if (k == 0)
		  {
			  System.out.print("NOT FOUND");
		  }
	}
}

