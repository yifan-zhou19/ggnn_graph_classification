package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int n;
		 int k;
		 int t;
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
	  for (i = 0;i < n;i++)
	  {
		   k = i;
		 for (j = i + 1;j < n;j++)
		 {
		   if (a[k] < a[j])
		   {
		t = a[k];
		a[k] = a[j];
		a[j] = t;
		   }
		 }
	  }
	  System.out.printf("%d\n%d",a[0],a[1]);
			return 0;
	}
}

