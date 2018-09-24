package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int t;
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
		for (i = 0;i < n / 2;i++)
		{
			t = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = t;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
		 if (i == n - 1)
		 {
			 break;
		 }
		 System.out.print(" ");
		}
	}
}

