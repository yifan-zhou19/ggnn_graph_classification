package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];

		  int k;
		  int i;
		  int j;
		  for (k = 0;k < n;k++)
		  {
			  a[k] = 0;
		  }
		  for (k = 0;;k++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   i = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   j = Integer.parseInt(tempVar3);
					   }
					   if (i == 0 && j == 0)
					   {
						   break;
					   }
					   else
					   {
						   a[i] -= 1;
						   a[j] += 1;

					   }
		  }
		  for (k = 0;k < n;k++)
		  {
						  if (a[k] == (n - 1))
						  {
										 System.out.printf("%d",k);
										 break;
										 k = 0;
						  }
		  }
		  if (k == n)
		  {
			  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}
}

