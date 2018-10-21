package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[50000];
	  int[] b = new int[50000];
	  int k;
	  int i;
	  int t;
	  int e;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
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
	  }
	  for (k = 1;k < n;k++)
	  {
		for (i = 0;i < n - k;i++)
		{
		  if (a[i] > a[i + 1])
		  {
			t = a[i];
			a[i] = a[i + 1];
			a[i + 1] = t;
			e = b[i];
			b[i] = b[i + 1];
			b[i + 1] = e;
		  }
		}
	  }
	  for (i = 0;i < n;i++)
	  {
	   if (b[i] < a[i + 1])
	   {
		  System.out.print("no");
		 break;
	   }
	   else
	   {
		 if ((b[i] > b[i + 1]) && (i != n - 1))
		 {
		   t = b[i];
		   b[i] = b[i + 1];
		   b[i + 1] = t;
		 }
	   }
	  }
	  if (i == n)
	  {
	System.out.printf("%d %d",a[0],b[n - 1]);
	  }
	  return 0;
	}
}

