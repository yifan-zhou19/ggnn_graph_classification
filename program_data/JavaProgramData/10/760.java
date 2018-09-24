package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  int[] opt = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  opt[i] = 1;
		  }
		  for (i = 1;i < n;i++)
		  {
		  for (j = 0;j < i;j++)
		  {
			   if (a[i] <= a[j] != 0 && opt[j] + 1> opt[i])
			   {
			   opt[i] = opt[j] + 1;
			   }
		  }
		  }
		  int t = 0;
		  for (i = 0;i < n;i++)
		  {
			  if (opt[i] > t)
			  {
			  t = opt[i];
			  }
		  }
		  System.out.printf("%d",t);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

