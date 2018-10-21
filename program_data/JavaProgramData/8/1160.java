package <missing>;

public class GlobalMembers
{
	public static int l1;
	public static int l2;
	public static int[] a1 = new int[50];
	public static int[] a2 = new int[50];
	public static int[] a3 = new int[100];
	public static void f1(int[] a1, int[] a2)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l2 = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 1;i <= l1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= l2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void f2(int l, int[] a)
	{
		int i;
		int j;
		int t;
		for (i = 1;i < l;i++)
		{
			for (j = 1;j <= l - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void f3(int[] a1, int[] a2, int[] a3)
	{
		int i;
		for (i = 1;i <= l1;i++)
		{
			a3[i] = a1[i];
		}
		for (i = l1 + 1;i <= l1 + l2;i++)
		{
			a3[i] = a2[i - l1];
		}
	}
	public static void f4(int[] a3)
	{
		int i;
		for (i = 1;i <= l1 + l2;i++)
		{
			if (i != 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a3[i]);
		}
	}
	public static int Main()
	{
		f1(a1, a2);
		f2(l1, a1);
		f2(l2, a2);
		f3(a1, a2, a3);
		f4(a3);
	}
}

