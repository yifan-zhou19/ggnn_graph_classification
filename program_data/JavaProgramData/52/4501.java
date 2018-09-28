package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int j;
		int k;
		int temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
		}
		for (j = n - m;j < n;j++)
		{
			for (k = 0;k < n - m;k++)
			{
				temp = a[j - k];
				a[j - k] = (a + j - 1 - k);
				a[j - 1 - k] = temp;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d%c",a[i],(i == n - 1)?'\n':' ');
		}
		return 0;
	}
}

