package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
		int j;
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
		for (j = 0;j < m;j++)
		{
			if (j == 0)
			{
				System.out.printf("%d",a[j + n - m]);
			}
			if (j != 0)
			{
				System.out.printf(" %d",a[j + n - m]);
			}
		}
		for (j = 0;j < n - m;j++)
		{
			System.out.printf(" %d",a[j]);
		}
		System.out.print("\n");
	}

}

