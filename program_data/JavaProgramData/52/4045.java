package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void move(int a[100],int n,int m);
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		move(a, n, m);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - 1]);
	}

	public static void move(int[] a, int n, int m)
	{
		int i;
		int d;
		d = a[n - 1];
		for (i = n - 1;i > 0;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = d;
		m--;
		if (m > 0)
		{
			move(a, n, m);
		}
	}

}

