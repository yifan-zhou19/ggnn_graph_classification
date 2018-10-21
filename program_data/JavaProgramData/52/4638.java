package <missing>;

public class GlobalMembers
{
	public static void move(int n, int m, int[] a)
	{
			 int i;
			 for (i = n - 1;i >= 0;i--)
			 {
				 a[i + m] = a[i];
			 }
			 for (i = 0;i <= m - 1;i++)
			 {
				  a[i] = a[n + i];
			 }
			 for (i = 0;i < n - 1;i++)
			 {
			 System.out.printf("%d ",a[i]);
			 }
			 System.out.printf("%d",a[n - 1]);
	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
			 move(n, m, a);
	}

}

