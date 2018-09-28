package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  int e;
	  int t;
	  int s;
	  int[] a = new int[50000];
	  int[] b = new int[50000];
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
	  for (k = 1;k <= n;k++)
	  {
		 for (i = 0;i < n - k;i++)
		 {
			if (a[i] > a[i + 1])
			{
			e = a[i];
			a[i] = a[i + 1];
			a[i + 1] = e;
			e = b[i];
			b[i] = b[i + 1];
			b[i + 1] = e;
			}
		 }
	  }
	t = 0;
	s = 0;
	  for (i = 1;i < n;i++)
	  {
		 for (k = 0;k < i;k++)
		 {
		   if (b[k] >= a[i])
		   {
			s = s + 1;
		   }
		 }
		 if (s != 0)
		 {
		   t = t + 1;
		   s = 0;
		 }
	  }
	  if (t != n - 1)
	  {
		System.out.print("no");
	  }
	  else
	  {
	   for (k = 1;k <= n;k++)
	   {
		 for (i = 0;i < n - k;i++)
		 {
			if (b[i] < b[i + 1])
			{
			e = b[i];
			b[i] = b[i + 1];
			b[i + 1] = e;
			}
		 }
	   }
	   System.out.printf("%d %d",a[0],b[0]);
	  }
	  return 0;
	}

}

