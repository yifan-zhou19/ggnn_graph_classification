package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] b = new int[65535];
	  int[] c = new int[65535];
	  int i;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	   for (i = 0;i < n;i++)
	   {
	   a[i] = 0;
	   }


	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b[0] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  c[0] = Integer.parseInt(tempVar3);
	  }
	  a[b[0]] = a[b[0]] - 1;
	  a[c[0]] = a[c[0]] + 1;
	  for (k = 0;;k++)
	  {
		 if (b[k] == 0 && c[k] == 0)
		 {
		 break;
		 }
		 else
		 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b[k + 1] = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 c[k + 1] = Integer.parseInt(tempVar5);
		 }
		 a[b[k + 1]] = a[b[k + 1]] - 1;
		 a[c[k + 1]] = a[c[k + 1]] + 1;
		 }
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] == (n - 1))
		{
		  System.out.printf("%d",i);
		  break;
		}
	  }
	   System.in.read();
	   System.in.read();
	}

}

