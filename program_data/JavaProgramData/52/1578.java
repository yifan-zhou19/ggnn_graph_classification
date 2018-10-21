package <missing>;

public class GlobalMembers
{
	public static void change(int n, int m, int[] a)
	{
		int[] p = a;
		int i;
		for (i = n - 1;i >= 0;i--)
		{
			p[i + m] = (p + i);
		}
		for (i = 0;i < m;i++)
		{
			p[i] = (p + i + n);
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		change(n, m, a);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

