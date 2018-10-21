package <missing>;

public class GlobalMembers
{
	public static void turn(int[] a, int n)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
			if (a[i] > a[j])
			{
				k = a[i];
				a[i] = a[j];
				a[j] = k;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
				if (i == 0)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(" %d",a[i]);
				}
		}
	}
	public static void f(int[] a, int[] b, int an, int bn)
	{
		turn(a, an);
		System.out.print(" ");
		turn(b, bn);
	}
	public static void Main()
	{
		int i;
		int an;
		int bn;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			an = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bn = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < an;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < bn;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		f(a, b, an, bn);
	}
}

