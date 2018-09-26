package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 10;i++)
		{
			a[i] = a[i - 1] / 10;
		}
		for (i = 0,n = 0;i < 10;i++)
		{
			if (a[i] != 0)
			{
				n = n + 1;
			}
		}
		for (i = 0,j = 0;j < n;i++,j++)
		{
			b[j] = a[i] % 10;
			System.out.printf("%d",b[j]);
		}

	}
}

