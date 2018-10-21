package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] d1 = new int[n];
		  int[] d2 = new int[n];
		  int a;
		  int b;
		  a = 1;
		  b = 1;
		  for (i = 0;i <= n - 1;i++)
		  {
						   d1[i] = 0;
						   d2[i] = 0;
		  }
		  while ((a != 0) || (b != 0))
		  {

						 a = 0;
						 b = 0;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b = Integer.parseInt(tempVar3);
						 }
						 if ((a == 0) && (b == 0))
						 {
						 break;
						 }
						 d2[b] = d2[b] + 1;
						 d1[a] = d1[a] + 1;
		  }
		  int m = 0;
		  for (i = 0;i <= n - 1;i++)
		  {

						   if ((d1[i] == 0) && (d2[i] == n - 1))
						   {
													 System.out.printf("%d",i);
													 m = 1;
						   }
		  }
		  if (m == 0)
		  {
		  System.out.print("NOT FOUND");
		  }

	}


}

