package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int[] c = new int[10000];
		  int[] d = new int[10000];
		  int i;
		  int j = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  c[i] = 0;
			  d[i] = 0;
		  }
		  while (true)
		  {
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
			   if (a == 0 && b == 0)
			   {
			   break;
			   }
			   else
			   {
				   c[a]++;
				   d[b]++;
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (c[i] == 0 && d[i] == n - 1)
			   {
					 System.out.printf("%d",i);
					 j = 1;
					 break;
			   }
		  }
		  if (j == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}


}

