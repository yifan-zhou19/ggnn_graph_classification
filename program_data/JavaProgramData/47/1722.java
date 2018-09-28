package <missing>;

public class GlobalMembers
{
	public static void inv(int[] x, int n)
	{
		 int temp;
		 int i;
		 int j;
		 int m = (n - 1) / 2;
		 for (i = 0;i <= m;i++)
		 {
						 j = n - 1 - i;
						 temp = x[i];
						 x[i] = x[j];
						 x[j] = temp;
		 }
						 return;
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
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
		inv(a, n);
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}

		System.out.printf("%d",a[n - 1]);
		 return 0;
	}




}

