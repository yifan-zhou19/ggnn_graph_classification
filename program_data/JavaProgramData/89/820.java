package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int count = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] p = new int[n * n];
		  for (i = 0;i < n * n;i++)
		  {
			  p[i] = 0;
		  }
		  for (i = 0;i < n;i++)
		  {
			  p[i * n + i] = 1;
		  }
		  for (i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   k = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   j = Integer.parseInt(tempVar3);
					   }
					   if (j == 0 && k == 0)
					   {
						   break;
					   }
					   else
					   {
						   p[j * n + k] = 1;
					   }
		  }
		  for (j = 0;j < n;j++)
		  {
			   for (k = 0;k < n;k++)
			   {
				   if (p[j * n + k] == 0)
				   {
				   break;
				   }
			   }
			   if (k == n)
			   {
					System.out.printf("%d\n",j);
					count++;
			   }
		  }
		  if (count == 0)
		  {
			  System.out.print("NOT FOUND\n");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

