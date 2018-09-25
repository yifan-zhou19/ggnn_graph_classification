package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n + 1];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[1]);
		while (k <= n)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[k] = Integer.parseInt(tempVar3);
		 }
		 i = 1;
		 while (i <= k - 1)
		 {
		   if (a[i] == a[k])
		   {
			   break;
		   }
		   else if (i == k - 1)
		   {
			   System.out.printf(" %d",a[k]);
		   }
		   i = i + 1;
		 }
		   k = k + 1;
		}
		  return 0;
	}
}

