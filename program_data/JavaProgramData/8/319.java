package <missing>;

public class GlobalMembers
{
	public static void order(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[j] < a[j - 1])
				{
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[50];
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		order(a, m);
		System.out.print(" ");
		order(b, n);
		System.out.print("\n");
	}




}

