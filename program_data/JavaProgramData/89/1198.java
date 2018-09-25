package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int i;
		  int[] c = new int[10000];
		  int[] d = new int[10000];
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  c[i] = 0;
		  }
		  d[i] = 0;
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
		  for (;(a != 0) || (b != 0);)
		  {
			   c[b] = c[b] + 1;
			   d[a] = d[a] + 1;
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   a = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(" ");
			   if (tempVar5 != null)
			   {
				   b = Integer.parseInt(tempVar5);
			   }
		  }
		  t = 0;
		  for (i = 0;i < n;i++)
		  {
			   if ((c[i] == (n - 1)) && (d[i] == 0))
			   {
				  System.out.printf("%d",i);
				  t = 1;
			   }
			   if (t == 1)
			   {
				   break;
			   }
		  }
		  if (t == 0)
		  {
			  System.out.print("NOT FOUND");
		  }



	}


}

