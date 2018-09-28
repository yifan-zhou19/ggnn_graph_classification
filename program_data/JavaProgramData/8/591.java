package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void abc(int c[],int p);
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (j = 0;j < n;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[j] = Integer.parseInt(tempVar4);
		}
		}
		abc(a, m);
		System.out.print(" ");

		abc(b, n);

	}
	public static void abc(int[] c, int p)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < p - 1;i++)
		{
		for (j = 0;j < p - 1 - i;j++)
		{
			if (c[j] > c[j + 1])
			{
				temp = c[j];
				c[j] = c[j + 1];
				c[j + 1] = temp;
			}
		}
		}
		for (i = 0;i < p - 1;i++)
		{
		System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[i]);

	}

}

