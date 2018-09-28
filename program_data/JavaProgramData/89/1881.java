package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;

		  int[] p = new int[n];
		  int[] q = new int[n];
		   for (m = 0;m < n;m++)
		   {
			  p[m] = 0;
			  q[m] = 0;
		   }

		  for (;;)
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
				  p[j]++;
				  q[i]++;
				 }
		  }

		   int h = 0;
		  for (m = 0;m < n;m++)
		  {
			 if (p[m] == (n - 1) && q[m] == 0)
			 {
			 System.out.printf("%d",m);
			 }
			 else
			 {
				 h++;
			 }
		  }
		  if (h == n)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();

	}
}

