package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int x;
		  int y;
		  int u;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  for (int i = 0;i < n;i++)
		  {
		  a[i] = 0;
		  }
		  u = 0;
		  for (int i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   x = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   y = Integer.parseInt(tempVar3);
					   }
					   if ((x == 0) && (y == 0))
					   {
					   break;
					   }
					   a[y]++;
					   a[x]--;
		  }
		  for (int i = 0;i < n;i++)
		  {
				  if (a[i] == n - 1)
				  {
				  System.out.printf("%d",i);
				  break;
				  }
				  u++;
		  }
		  if (u == n)
		  {
		  System.out.print("NOT FOUND");
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);

	}

}

