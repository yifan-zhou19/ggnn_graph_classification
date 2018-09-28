package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[20000];
		  int[] b = new int[20000];
		  int[] c = new int[20000];
		  int[] d = new int[20000];
		  int t = 0;
		  int i;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;;i++)
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
			  if (a[i] == 0 && b[i] == 0)
			  {
				 break;
			  }
		  }
		  for (i = 0;;i++)
		  {
			   if (a[i] == 0 && b[i] == 0)
			   {
			   break;
			   }
			   else
			   {
			   c[a[i]]++;
			   d[b[i]]++;
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (c[i] == 0 && d[i] == n - 1)
			  {
					 System.out.printf("%d",i);
					 t++;
			  }
		  }
		  if (t == 0)
		  {
		  System.out.print("NOT FOUND\n");
		  }
		  System.in.read();
		  System.in.read();
	}
}

