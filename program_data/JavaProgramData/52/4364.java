package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void loop(int a[],int b);
		int n;
		int m;
		int i;
		int[] c = new int[100];
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
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - m;i++)
		{
			loop(c, n);
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
	public static void loop(int[] a, int b)
	{
		int i;
		int temp = a[0];
		for (i = 0;i < b - 1;i++)
		{
			a[i] = a[i + 1];
		}
		a[b - 1] = temp;
	}
}

