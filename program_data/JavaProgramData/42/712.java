package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		int j;
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
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	   for (i = 0;i < n;i++)
	   {
	   if (a[i] == k)
	   {
		   a[i] = 65500;
	   }
	   }
		for (i = 0;i < n;i++)
		{
		if (a[i] != 65500)
		{
		   System.out.printf("%d",a[i]);
		   break;
		}
		}
		for (j = i + 1;j < n;j++)
		{
		if (a[j] != 65500)
		{
		System.out.printf(" %d",a[j]);
		}
		}
	   return 0;
	}
}

