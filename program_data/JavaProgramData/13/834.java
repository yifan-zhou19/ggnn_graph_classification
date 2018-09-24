package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		a[k] = a[k] + 1;
		System.out.printf("%d",k);
	   for (i = 2;i <= n;i++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 k = Integer.parseInt(tempVar3);
		 }
		 a[k] = a[k] + 1;
		 if (a[k] == 1)
		 {
		 System.out.printf(" %d",k);
		 }
	   }
		 return 0;
	}



}

