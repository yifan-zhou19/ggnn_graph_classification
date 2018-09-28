package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		int[] a = new int[100];
		int i;
		int temp;
		int n;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;i <= n / 2;i++)
		{
		   temp = a[i];
		   a[i] = a[n + 1 - i];
		   a[n + 1 - i] = temp;
		}
		for (i = 1;i < n;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n]);
		return 0;
	   }
}

