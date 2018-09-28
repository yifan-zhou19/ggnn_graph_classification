package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int c;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i - 1] = Integer.parseInt(tempVar2);
		}
		}
		b = a[0];
		for (i = 0;i < n;i++)
		{
		if (b < a[i])
		{
		b = a[i];
		}
		}
		System.out.printf("%d\n",b);
	   if (b == a[0])
	   {
		 c = a[1];
	   }
		 else
		 {
			 c = a[0];
		 }
	   for (i = 0;i < n;i++)
	   {
		 if (c < a[i] && a[i] < b)
		 {
		  c = a[i];
		 }
	   }
	   System.out.printf("%d",c);
	 return 0;
	}
}

