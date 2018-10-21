package <missing>;

public class GlobalMembers
{
	public static void shuru(int[] a, int[] b)
	{
		int m;
		int n;
		int i;
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
		for (i = 0; i < m; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void paixu(int[] a)
	{
		int i;
		int j;
		int temp;
		int len = 0;
		for (i = 0; a[i] != 0; i++)
		{
			len++;
		}
		for (j = 1; j < len; j++)
		{
			for (i = 0; i < len - j; i++)
			{
				if (a[i] > a[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}
	public static void hebing(int[] a, int[] b)
	{
		int i;
		int lena = 0;
		int lenb = 0;
		for (i = 0; a[i] != 0; i++)
		{
			lena++;
		}
		for (i = 0; b[i] != 0; i++)
		{
			lenb++;
		}
		for (i = 0; i < lenb; i++)
		{
			a[i + lena] = b[i];
		}
	}
	public static void shuchu(int[] a)
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1; a[i] != 0; i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		shuru(a, b);
		paixu(a);
		paixu(b);
		hebing(a, b);
		shuchu(a);
	}
}

