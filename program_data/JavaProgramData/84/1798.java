package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int m;
		int next;
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
		 if (a[0] > a[1])
		 {
			 m = a[0];
		 next = a[1];
		 }
		 if (a[1] > a[0])
		 {
			 m = a[1];
		 next = a[0];
		 }
		 for (i = 0;i < n;i++)
		 {
			 if (a[i] > m)
			 {
		 m = a[i];
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 if (a[i] < m && a[i]> next)
			 {
			 next = a[i];
			 }
		 }
		System.out.printf("%d\n%d",m,next);
		return 0;
	}
}

