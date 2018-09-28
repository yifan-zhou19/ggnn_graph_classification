package <missing>;

public class GlobalMembers
{
	public static int pai(int[] a, int n, int k)
	{
		int i;
		int[] b = new int[100];
		for (i = 0;i <= (n - 1);i++)
		{
			if (i <= (n - 1 - k))
			{
				b[i + k] = a[i];
			}
			else
			{
				b[i + k - n] = a[i];
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			a[i] = b[i];
		}
		//return a[n];
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		pai(a, n, k);
		for (i = 0;i <= (n - 1);i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[0]);
			}
			else
			{
			System.out.printf(" %d",a[i]);
			}
		}
	}
}

