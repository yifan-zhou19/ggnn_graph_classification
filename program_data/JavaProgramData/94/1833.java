package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int len)
	{
		int i;
		int j;
		int temp;
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
	public static void Main()
	{
		int i;
		int n;
		int j;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0, j = 0; i < n; i++)
		{
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j++;
			}
		}
		bubble(b, j);
		System.out.printf("%d",b[0]);
		for (i = 1; i < j; i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}
}

